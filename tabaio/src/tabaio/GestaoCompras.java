package tabaio;

import java.util.List;

public class GestaoCompras {
    private Estoque estoque;

    public GestaoCompras(Estoque estoque) {
        this.estoque = estoque;
    }

    public void sugerirCompras() {
        List<Produto> produtosFaltando = estoque.listarProdutosFaltando();
        if (produtosFaltando.isEmpty()) {
            System.out.println("Não há produtos com estoque baixo.");
        } else {
            System.out.println("Produtos que precisam ser comprados:");
            for (Produto produto : produtosFaltando) {
                System.out.println(produto.getNome() + " - Estoque atual: " + produto.getQuantidadeEstoque());
            }
        }
    }
}