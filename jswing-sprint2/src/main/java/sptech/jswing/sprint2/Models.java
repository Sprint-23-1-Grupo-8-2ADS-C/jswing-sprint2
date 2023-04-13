/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.jswing.sprint2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author marcusgoncalves
 */
public class Models {
    private String servername;
    private String sqlInstanceName;
    private String sqlDatabase;
    private String sqlUser;
    private String sqlPassword;
    
    
    public Models() {
        this.servername = "airplane-solutions.database.windows.net";
        this.sqlInstanceName = "airplane-solutions";
        this.sqlDatabase = "bd-airplane-solutions";
        this.sqlUser = "totemInfo@airplane-solutions";
        this.sqlPassword = "Totem_!nf0";
    }
     
   
    private String connectURL;
    
    public void testarConexao() {
        try(Connection conn = DriverManager.getConnection(connectURL); Statement stmt = conn.createStatement();) {
            String resultado = "Conectado no Banco da Azure";
            System.out.println(resultado);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
