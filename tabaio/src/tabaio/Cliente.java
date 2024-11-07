package tabaio;

public class Cliente {
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(String cpf, String nome, String endereco, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e setters
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " - CPF: " + cpf + " - Endereço: " + endereco;
    }
}
