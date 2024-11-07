package tabaio;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private double custoUnitario;

    public Produto(String codigo, String nome, double preco, int quantidadeEstoque, double custoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.custoUnitario = custoUnitario;
    }

    // Getters e setters
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void atualizarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public double getCustoUnitario() {
        return custoUnitario;
    }

    @Override
    public String toString() {
        return codigo + " - " + nome + " - Preço: R$ " + preco + " - Estoque: " + quantidadeEstoque;
    }
}
