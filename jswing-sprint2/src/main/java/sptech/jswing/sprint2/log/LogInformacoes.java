/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.jswing.sprint2.log;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author NauanaCoelhodosSanto
 */
public class LogInformacoes {
    private String dataAtual;
    private String horaAtual;    

    public void getData(){
        Date dataHoraAtual = new Date();
    
        dataAtual = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    }
    
    public void getHora(){
        Date dataHoraAtual = new Date();
    
        horaAtual = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
    }

    @Override
    public String toString() {
        return String.format("-------------------------------------------------------------------------------\n" +
        ">Log Session: %d%d", dataAtual, horaAtual);
    }
    
}
