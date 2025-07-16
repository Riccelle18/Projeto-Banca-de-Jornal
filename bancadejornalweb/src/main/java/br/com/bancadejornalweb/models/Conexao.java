package br.com.bancadejornalweb.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConnection() throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/bancadejornal";
        String USER = "root";
        String PASSWORD = "1234";
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
