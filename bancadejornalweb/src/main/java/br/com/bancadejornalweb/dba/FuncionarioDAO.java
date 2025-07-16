package br.com.bancadejornalweb.dba;

import br.com.bancadejornalweb.models.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {
    public void inserir(Funcionario f) throws SQLException {
        Connection c = Conexao.getConnection();
        PreparedStatement ps = c.prepareStatement("INSERT INTO Funcionario (nome, cargo, salario) VALUES (?, ?, ?)");
        ps.setString(1, f.getNome());
        ps.setString(2, f.getCargo());
        ps.setDouble(3, f.getSalario());
        ps.executeUpdate();
        ps.close();
        c.close();
    }
}
