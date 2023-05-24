package sptech.jswing.sprint2.models;

import com.github.britooo.looca.api.core.Looca;
import java.time.Instant;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.Date;

import sptech.jswing.sprint2.controllers.ShowCPU;
import sptech.jswing.sprint2.controllers.ShowDisco;
import sptech.jswing.sprint2.controllers.ShowMemoria;
import sptech.jswing.sprint2.controllers.ShowRede;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;


public class RegistroTotemCRUD {
    
    private Looca looca = new Looca();
    
    private Connection conexao = new Connection(false);
    private JdbcTemplate con = conexao.getConnection();
    
    private Connection conexaoLocal = new Connection(false);
    private JdbcTemplate conLocal = conexaoLocal.getConnection();
    
    
    public void insertRegistroComponente(Integer fkTotem, Integer fkCompanhia, String token){
        TotemCRUD totemCrud = new TotemCRUD();
        AtomicBoolean shouldContinue = new AtomicBoolean(true);

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Boolean boolCaptura = (Boolean) totemCrud.selectBoolCaptura(token).get("boolCaptura");
                
                if(boolCaptura){
                    System.out.println("Registro dos componentes capturados a cada 5 segundos");
                    insertRegistroRam(fkTotem, fkCompanhia);
                    insertRegistroDisco(fkTotem, fkCompanhia);
                    insertRegistroCpu(fkTotem, fkCompanhia);
                    insertRegistroRede(fkTotem, fkCompanhia);
                }
                else{
                    shouldContinue.set(false);
                }
            }
        }, 0, 5000);
        
    }
    public void insertRegistroRam(Integer fkTotem, Integer fkCompanhia){
        
        Integer fkComponente = 1;
        ShowMemoria memoria = new ShowMemoria();
        Long usoRam = memoria.showUsoRam();
        
        con.update(
            "INSERT INTO RegistroComponente(fkTotem, fkComponente, fkCompanhia, valorUso, dataHoraCaptura) VALUES (?,?,?,?,?)", 
            fkTotem, 
            fkComponente, 
            fkCompanhia, 
            usoRam, 
            new Date()
        );
    }
    
    public void insertRegistroDisco(Integer fkTotem, Integer fkCompanhia){
        Integer fkComponente = 2;
        ShowDisco disco = new ShowDisco();

        Double usoDisco = disco.showUsoDisco();
        Long tempoTransferencia = disco.showTempoTransferencia();
        Long total = disco.showTotal();

        con.update(
            "INSERT INTO RegistroComponente(fkTotem, fkComponente, fkCompanhia, valorUso, tempoTransferencia, dataHoraCaptura) VALUES (?,?,?, ?,?,?)",
            fkTotem, 
            fkComponente, 
            fkCompanhia, 
            usoDisco,
            tempoTransferencia, 
            new Date()
        );
    }
    
    public void insertRegistroCpu(Integer fkTotem, Integer fkCompanhia){
        Integer fkComponente = 3;
        ShowCPU cpu = new ShowCPU();
        
        Integer usoCpu = cpu.showUsoCpu();
        Double clockCpu = cpu.showClockCpu();
        String tempoAtividade = cpu.showTempoAtividade();
        Date inicializado = Date.from(cpu.showInicializado());
        
        con.update(
            "INSERT INTO RegistroComponente(fkTotem, fkComponente, fkCompanhia, valorUso, clock, dataHoraCaptura, tempoAtividade, dataInicializacao) VALUES (?,?,?, ?,?,?,?,?)", 
            fkTotem, 
            fkComponente, 
            fkCompanhia, 
            usoCpu, 
            clockCpu, 
            new Date(), 
            tempoAtividade,
            inicializado
        );
   }
    
    public void insertRegistroRede(Integer fkTotem, Integer fkCompanhia){
        Integer fkComponente = 4;
        ShowRede rede = new ShowRede();
        Long bytesEnviados = rede.showBytesEnviados();
        Long bytesRecebidos = rede.showBytesRecebidos();

        con.update(
            "INSERT INTO RegistroComponente(fkTotem, fkComponente, fkCompanhia, bytesEnviados, bytesRecebidos, dataHoraCaptura) VALUES (?,?,?, ?,?,?)",
            fkTotem, 
            fkComponente, 
            fkCompanhia, 
            bytesEnviados, 
            bytesRecebidos,
            new Date()
        );
    }
}
