package br.com.bancadejornalweb.models;

public class Estoque {
    private String produto;
    private int quantidade;
    private double preco;

    public Estoque(String produto, int quantidade, double preco) {
        this.produto = produto;
        setQuantidade(quantidade);
        this.preco = preco;
    }

    public String getProduto() { return produto; }
    public void setProduto(String produto) { this.produto = produto; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) {
        if (quantidade < 0) throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        this.quantidade = quantidade;
    }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}
