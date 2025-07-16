package bancadejornalpi.model;

public class Cliente {
    private String nome, endereco, telefone;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        setTelefone(telefone);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) {
        if (!telefone.matches("\\d{8,15}")) {
            throw new IllegalArgumentException("Telefone deve conter apenas números (8 a 15 dígitos).");
        }
        this.telefone = telefone;
    }
}
