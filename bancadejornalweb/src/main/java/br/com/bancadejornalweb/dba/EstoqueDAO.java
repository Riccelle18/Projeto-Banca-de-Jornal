package br.com.bancadejornalweb.dba;

import br.com.bancadejornalweb.models.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EstoqueDAO {
    public void inserir(Estoque e) throws SQLException {
        Connection conn = Conexao.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO Estoque (nomeProduto, quantidade, preco) VALUES (?, ?, ?)");
        ps.setString(1, e.getProduto());
        ps.setInt(2, e.getQuantidade());
        ps.setDouble(3, e.getPreco());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}