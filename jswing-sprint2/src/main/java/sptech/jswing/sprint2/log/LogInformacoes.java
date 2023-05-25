/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.jswing.sprint2.log;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.util.Conversor;


/**
 *
 * @author NauanaCoelhodosSanto
 */
public class LogInformacoes {    
    private String dataAtual;
    private String horaAtual; 
    
    Looca looca;
    Conversor conversor;


    public LogInformacoes(){
        looca = new Looca();
        conversor = new Conversor();
        
        
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        dataAtual = dateTime.format(formatter);
        
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HHmmss");
        horaAtual = time.format(formatterTime);
    }
    
    

    public void getDataHora(){
        
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        dataAtual = dateTime.format(formatter);
        
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        horaAtual = time.format(formatterTime);
        
    }
    
    public String formarLogWarning(String token){
        return String.format("-------------------------------------------------------------------------------\n" +
        ">Log Session: %s %s\n"
       +">System Info:\n"
       +"  Projec version:             = Airplane-Solutions-1.0.0\n"
       +"  Java version:               = Java 17.0.0\n"
       +"  Operating System:           = %s\n"
       +"  Processor:                  = %s\n"
       +"  Memory:                     = %s\n"
       +"  Memory in use:              = %s\n"
       +"  Disk:                       = SLA VAI VIM AINDA\n"
       +"  Acess Token:                = %s\n"
       +"  Warning:                    = Foi emitido um aviso de alerta para o Slack", dataAtual, horaAtual, looca.getSistema().getSistemaOperacional(), looca.getProcessador().getNome(), 
            conversor.formatarBytes(looca.getMemoria().getTotal()), conversor.formatarBytes(looca.getMemoria().getEmUso()), token);
    }
    
    public String formarLogInfo(String token){
        return String.format("-------------------------------------------------------------------------------\n" +
        ">Log Session: %s %s\n"
       +">System Info:\n"
       +"  Projec version:             = Airplane-Solutions-1.0.0\n"
       +"  Java version:               = Java 17.0.0\n"
       +"  Operating System:           = %s\n"
       +"  Processor:                  = %s\n"
       +"  Memory:                     = %s\n"
       +"  Memory in use:              = %s\n"
       +"  Disk:                       = SLA VAI VIM AINDA\n"
       +"  Acess Token:                = %s\n"
       +"  Information:                = Login realizado com sucesso!", dataAtual, horaAtual, looca.getSistema().getSistemaOperacional(), looca.getProcessador().getNome(), 
            conversor.formatarBytes(looca.getMemoria().getTotal()), conversor.formatarBytes(looca.getMemoria().getEmUso()), token);
    }

    public String getDataAtual() {
        return dataAtual;
    }

    public String getHoraAtual() {
        return horaAtual;
    }
    
}
