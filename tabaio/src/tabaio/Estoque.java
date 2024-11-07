package tabaio;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    private int limiteDeReestoque = 10; // Estoque mínimo para cada produto

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutosFaltando() {
        List<Produto> listaFalta = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getQuantidadeEstoque() < limiteDeReestoque) {
                listaFalta.add(produto);
            }
        }
        return listaFalta;
    }

    public void exibirEstoque() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
