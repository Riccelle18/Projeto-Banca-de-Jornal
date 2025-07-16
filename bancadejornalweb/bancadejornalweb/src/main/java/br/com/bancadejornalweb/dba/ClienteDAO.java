package br.com.bancadejornalweb.dba;

import br.com.bancadejornalweb.models.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    public void inserir(Cliente c) throws SQLException {
        Connection conn = Conexao.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO Cliente (nome, endereco, telefone) VALUES (?, ?, ?)");
        ps.setString(1, c.getNome());
        ps.setString(2, c.getEndereco());
        ps.setString(3, c.getTelefone());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}