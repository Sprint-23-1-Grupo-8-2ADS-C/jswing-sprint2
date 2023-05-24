package sptech.jswing.sprint2.models;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Connection {
    private JdbcTemplate connection;

    public Connection(Boolean banco) {
        BasicDataSource dataSource = new BasicDataSource();
        
        if(banco){
            dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            dataSource.setUrl("jdbc:sqlserver://airplane-solutions.database.windows.net:1433;"
                    + "database=bd-airplane-solutions;encrypt=true;trustServerCertificate=false;"
                    + "hostNameInCertificate=*.database.windows.net;");
            dataSource.setUsername("totemInfo@airplane-solutions");
            dataSource.setPassword("Totem_!nf0");
        }
        else{
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/projetoIndividual?autoReconnect=true&useSSL=false");
            dataSource.setUsername("root");
            dataSource.setPassword("1234");
        }
        
        this.connection = new JdbcTemplate(dataSource);
    }
    
    public JdbcTemplate getConnection() {
        System.out.println("Acessando o banco de dados!");
        return connection;
    }
}
