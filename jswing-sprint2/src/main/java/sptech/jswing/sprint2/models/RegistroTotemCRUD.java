package sptech.jswing.sprint2.models;

import com.github.britooo.looca.api.core.Looca;
import org.springframework.jdbc.core.JdbcTemplate;
import sptech.jswing.sprint2.controllers.ShowCPU;
import java.util.Date;


public class RegistroTotemCRUD {
    private Connection conexao = new Connection();
    private JdbcTemplate con = conexao.getConnection();
    private Looca looca = new Looca();
    private ShowCPU cpu = new ShowCPU();
    
    public void insertRegistroCpu(Integer fkTotem, Integer fkComponente, Integer fkCompanhia){
        con.update("INSERT INTO RegistroComponente(fkTotem, fkComponente, fkCompanhia, valorUso, clock, dataHoraCaptura, tempoAtividade, dataInicializacao) VALUES (?,?,?, ?,?,?,?,?)", 
                    fkTotem, 
                    fkComponente, 
                    fkCompanhia, 
                    cpu.showUsoCpu(), 
                    cpu.showClockCpu(), 
                    new Date(), 
                    cpu.showTempoAtividade(), 
                    cpu.showTempoAtividade()); 
   }
}
