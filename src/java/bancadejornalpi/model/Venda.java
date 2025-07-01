package bancadejornalpi.model;

import java.util.Date;

public class Venda {
    private Date dataVenda;
    private double valorTotal;
    private Funcionario funcionario;
    private Cliente cliente;

    public Venda(Date dataVenda, double valorTotal, Funcionario funcionario, Cliente cliente) {
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public Date getDataVenda() { return dataVenda; }
    public double getValorTotal() { return valorTotal; }
    public Funcionario getFuncionario() { return funcionario; }
    public Cliente getCliente() { return cliente; }
}
