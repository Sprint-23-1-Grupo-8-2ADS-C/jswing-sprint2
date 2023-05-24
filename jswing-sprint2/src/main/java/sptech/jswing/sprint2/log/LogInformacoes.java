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
    
    public String formarLog(){
        return String.format("-------------------------------------------------------------------------------\n" +
        ">Log Session: %s %s\n"
       +">System Info:\n"
       +"  Projec version:             = Airplane-Solutions-1.0.0\n"
       +"  Java version:               = Java 17.0.0\n"
       +"  Operating System:           = \n"
       +"  Processor:                  = \n"
       +"  Memory:                     = \n"
       +"  Memory in use:              = \n"
       +"  Disk:                       = \n"
       +"  Warning:                    = ", dataAtual, horaAtual);
    }
    
    public String formarLog(String token){
        String disco = null;
        
        
      
        return String.format("-------------------------------------------------------------------------------\n" +
        ">Log Session: %s %s\n"
       +">System Info:\n"
       +"  Projec version:             = Airplane-Solutions-1.0.0\n"
       +"  Java version:               = Java 17.0.0\n"
       +"  Operating System:           = %s\n"
       +"  Processor:                  = %s\n"
       +"  Memory:                     = %s\n"
       +"  Memory in use:              = %s\n"
       +"  Disk:                       = %s\n"
       +"  Acess Token:                = %s\n"
       +"  Information:                = ", dataAtual, horaAtual, looca.getSistema().getSistemaOperacional(), looca.getProcessador().getNome(), 
            conversor.formatarBytes(looca.getMemoria().getTotal()), conversor.formatarBytes(looca.getMemoria().getEmUso()), token);
    }

    public String getDataAtual() {
        return dataAtual;
    }

    public String getHoraAtual() {
        return horaAtual;
    }
    
}
