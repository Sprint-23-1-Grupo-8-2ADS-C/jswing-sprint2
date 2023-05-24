/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.jswing.sprint2.log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author NauanaCoelhodosSanto
 */
public class GerateLog {
    public static void main(String[] args) throws IOException {
        LogInformacoes log = new LogInformacoes();
        gerarLog(log.toString());
        
    }
    
      public static void gerarLog(String mensagem) throws IOException{
        
        //criando a pasta
            Path direct = Paths.get("C:\\logs");
        
            if(!Files.exists(direct)){
                Files.createDirectories(direct);
            }
            
            //criando o arquivo
            
            File log = new File("C:\\logs\\log.txt");;
        
                if(!log.exists()){
                    log.createNewFile();
                }
            
            FileWriter fw = new FileWriter(log, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(mensagem);
            bw.newLine();
            bw.close();
            fw.close();
        
    } 
}
