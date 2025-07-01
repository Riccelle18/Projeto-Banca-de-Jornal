package bancadejornalpi.dao;

import java.sql.*;
import java.util.Date;
import bancadejornalpi.model.*;

public class VendaDAO {
    public void inserir(Venda v) throws SQLException {
        Connection conn = Conexao.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO Venda (dataVenda, valorTotal, funcionario_id, cliente_id) VALUES (?, ?, ?, ?)");
        ps.setDate(1, new java.sql.Date(v.getDataVenda().getTime()));
        ps.setDouble(2, v.getValorTotal());
        ps.setInt(3, 1); // ID fictício
        ps.setInt(4, 1); // ID fictício
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}