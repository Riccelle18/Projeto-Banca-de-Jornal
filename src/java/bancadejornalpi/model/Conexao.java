package bancadejornalpi.model;

import java.sql.*;

public class Conexao {
    public static Connection getConnection() throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/loja";
        String USER = "root";
        String PASSWORD = "1234";
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
