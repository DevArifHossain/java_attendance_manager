import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    String url = "jdbc:mysql://localhost:3306/at_managment";
    String username = "root";
    String password = "14101999";
    public  Connection dbConnection;

    public Connection getConnection() {
        try {
            dbConnection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        };
        return dbConnection;
    }
}
