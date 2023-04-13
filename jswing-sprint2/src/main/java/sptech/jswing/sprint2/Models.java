package sptech.jswing.sprint2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
    private String connectURL;

    public Models() {
        this.servername = "airplane-solutions.database.windows.net";
        this.sqlInstanceName = "airplane-solutions";
        this.sqlDatabase = "bd-airplane-solutions";
        this.sqlUser = "totemInfo";
        this.sqlPassword = "Totem_!nf0";
        this.connectURL = "jdbc:sqlserver://" + servername + ":1433;"
            + "database=" + sqlDatabase + ";user=" + sqlUser  + "@" + sqlInstanceName + ";password=" + sqlPassword + ";"
            + "encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    }
    
    
    public void testarConexao() {
        try(Connection conn = DriverManager.getConnection(connectURL); Statement stmt = conn.createStatement();) {
            String resultado = "Conectado no Banco da Azure";
            System.out.println(resultado);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void selectTotem() {
        try(Connection conn = DriverManager.getConnection(connectURL); Statement stmt = conn.createStatement();) {
            String resultadoConexao = "Conectado no Banco da Azure";
            String query = "SELECT t.idTotem, f.senha FROM Totem as t "
                    + "INNER JOIN companhiaAerea as ca ON ca.idCompanhia = t.fkCompanhia "
                    + "INNER JOIN funcionario as f ON f.fkCompanhia = ca.idCompanhia;";
            ResultSet rs = stmt.executeQuery(query);
            System.out.println(resultadoConexao);
            System.out.println(rs);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
