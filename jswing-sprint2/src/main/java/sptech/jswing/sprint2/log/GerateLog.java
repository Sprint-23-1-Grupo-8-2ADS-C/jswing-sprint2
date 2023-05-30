/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.jswing.sprint2.log;

import java.io.IOException;

/**
 *
 * @author NauanaCoelhodosSanto
 */
public class GerateLog {

    public static void main(String[] args) throws IOException {
        LogInformacoes log = new LogInformacoes();

        log.getDataHora();
        GerationLog.gerarLog(log.formarLogInfo("A232"));

        new Thread(() -> {
            try {
                Thread.sleep(60000);
                log.getDataHora();
                GerationLog.gerarLog(log.formarLogWarning("A232"));
            } catch (Exception e) {
                System.err.println(e);
            }
        }).start();

    }
}
