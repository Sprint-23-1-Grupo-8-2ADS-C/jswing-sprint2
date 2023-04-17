package sptech.jswing.sprint2.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author marcusgoncalves
 */
public class Models {
    
    private JdbcTemplate connection;

    public Models() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://airplane-solutions.database.windows.net:1433;database=bd-airplane-solutions;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;");
        dataSource.setUsername("totemInfo@airplane-solutions");
        dataSource.setPassword("Totem_!nf0");
        
        this.connection = new JdbcTemplate(dataSource);
    }
    
    public JdbcTemplate getConnection() {
        return connection;
    }
}
