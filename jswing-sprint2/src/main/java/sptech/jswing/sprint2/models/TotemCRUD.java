package sptech.jswing.sprint2.models;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import java.util.ArrayList;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sptech.jswing.sprint2.controllers.Totem;

import java.util.List;
import java.util.Map;
import sptech.jswing.sprint2.controllers.ComponenteTotem;

public class TotemCRUD {
        
    private Connection conexao = new Connection();
    private JdbcTemplate con = conexao.getConnection();
    private Looca looca = new Looca();
    
    public Totem getTotemByToken(String token) {
        List<Totem> validacaoTotem = con.query("SELECT * FROM totem WHERE token = ?"
                , new BeanPropertyRowMapper(Totem.class), token);
        
        Totem totem = validacaoTotem.get(0);
        
        //VALIDANDO SE FOI INSERIDO PELO USUÁRIO OS DADOS DO TOTEM
        if(totem.getProcessador() == null){
            updateTotemInformation(totem.getIdTotem());
        }
        
        //VALIDANDO SE OS COMPONENTES DO TOTEM JÁ FORAM CADASTRADOS
        validationComponenteTotem(totem.getIdTotem(), totem.getFkCompanhia());
        
        //PASSANDO A LISTA DE COMPONENTES PARA O OBJETO TOTEM
        List<ComponenteTotem> componentes = con.query("SELECT * FROM ComponenteTotem WHERE fkTotem = ?",
                new BeanPropertyRowMapper(ComponenteTotem.class), totem.getIdTotem());
        
        totem.setComponentes(componentes);
        return totem;
    }
    public void updateBoolCaptura(String token, Integer bool){
        con.update("UPDATE totem SET boolCaptura = ? WHERE token = ?", bool, token);
    }
    
    public Map<String, Object> selectBoolCaptura(String token){
        Map<String, Object> bool = con.queryForMap("SELECT boolCaptura FROM totem WHERE token = ?", token);
        return bool;
    }
    
    public void updateTotemInformation(Integer idTotem){
        
        String arquitetura = looca.getSistema().getArquitetura() + "bits";
        String sistemaOperacional = looca.getSistema().getSistemaOperacional();
        String processador = looca.getProcessador().getNome();
        String fabricante = looca.getProcessador().getFabricante();
        
        con.update("UPDATE Totem SET fabricante = ?, arquitetura = ?, sistemaOperacional = ?, processador = ? WHERE idTotem = ?",
                    fabricante, arquitetura, sistemaOperacional, processador, idTotem);
    }
    
    public void validationComponenteTotem(Integer idTotem, Integer idCompanhia){
        insertComponenteRam(idTotem, idCompanhia);
        insertComponenteDisco(idTotem, idCompanhia);
        insertComponenteCpu(idTotem, idCompanhia);
        insertComponenteRede(idTotem, idCompanhia);
    }
    
    public void insertComponenteRam(Integer idTotem, Integer idCompanhia){
        Integer idComponente = 1;
        List<ComponenteTotem> componente = con.query("SELECT * FROM ComponenteTotem WHERE fkComponente = ? AND fkTotem = ?", 
                new BeanPropertyRowMapper(ComponenteTotem.class), idComponente, idTotem);
        
        if(componente.isEmpty()){
            long total = looca.getMemoria().getTotal();

            con.update("INSERT INTO ComponenteTotem(fkTotem, fkComponente, total, fkCompanhia) VALUES (?,?,?,?)",
                        idTotem, idComponente, total, idCompanhia);
        }
    }
    
    public void insertComponenteDisco(Integer idTotem, Integer idCompanhia){
        Integer idComponente = 2;
        List<ComponenteTotem> componente = con.query("SELECT * FROM ComponenteTotem WHERE fkComponente = ? AND fkTotem = ?", 
                new BeanPropertyRowMapper(ComponenteTotem.class), idComponente, idTotem);
        
        if(componente.isEmpty()){
            long total = looca.getGrupoDeDiscos().getTamanhoTotal();
            
            con.update("INSERT INTO ComponenteTotem(fkTotem, fkComponente, TOTAL, fkCompanhia) VALUES (?,?,?,?)",
                        idTotem, idComponente, total, idCompanhia);
        }
    }
    
    public void insertComponenteCpu(Integer idTotem, Integer idCompanhia){
        Integer idComponente = 3;
        List<ComponenteTotem> componente = con.query("SELECT * FROM ComponenteTotem WHERE fkComponente = ? AND fkTotem = ?", 
                new BeanPropertyRowMapper(ComponenteTotem.class), idComponente, idTotem);
        
        if(componente.isEmpty()){
            long frequencia = looca.getProcessador().getFrequencia();
            String descricaoCpu = looca.getProcessador().getIdentificador();
            
            con.update("INSERT INTO ComponenteTotem(fkTotem, fkComponente, frequencia, descricao, fkCompanhia) VALUES (?,?,?,?,?)",
                        idTotem, idComponente, frequencia, descricaoCpu, idCompanhia);
        }
    }
    
    public void insertComponenteRede(Integer idTotem, Integer idCompanhia){
        List ipv4 = new ArrayList(); 
        Integer idComponente = 4; 
        
        List<ComponenteTotem> componente = con.query("SELECT * FROM ComponenteTotem WHERE fkComponente = ? AND fkTotem = ?",
                new BeanPropertyRowMapper(ComponenteTotem.class), idComponente, idTotem);
        
        if(componente.isEmpty()){
            List<RedeInterface> rede = looca.getRede().getGrupoDeInterfaces().getInterfaces();

            for(RedeInterface redeInterface : rede){
                if(redeInterface.getEnderecoIpv4().size() > 0){
                    ipv4.add(redeInterface.getEnderecoIpv4().get(0));
                }
            }

            if(ipv4.size() >= 2){
                con.update("INSERT INTO ComponenteTotem (fkTotem, fkComponente, enderecoIPv4Rede, enderecoIPv4Totem, fkCompanhia) VALUES (?,?,?,?,?)",
                        idTotem, idComponente, ipv4.get(0), ipv4.get(1), idCompanhia);
            }

            if(ipv4.size() == 1){
                con.update("INSERT INTO ComponenteTotem (fkTotem, fkComponente, enderecoIPv4Totem, fkCompanhia) VALUES (?,?,?,?)",
                        idTotem, idComponente, ipv4.get(0), idCompanhia);
            }
        }
    }
    
}   
