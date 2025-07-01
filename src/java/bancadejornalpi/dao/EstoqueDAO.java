package bancadejornalpi.dao;

import java.sql.*;
import bancadejornalpi.model.*;

public class EstoqueDAO {
    public void inserir(Estoque e) throws SQLException {
        Connection conn = Conexao.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO Estoque (produto, quantidade, preco) VALUES (?, ?, ?)");
        ps.setString(1, e.getProduto());
        ps.setInt(2, e.getQuantidade());
        ps.setDouble(3, e.getPreco());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}