package tabaio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // --- 1. Cadastro de Produtos ---
        Produto pao = new Produto("A001", "Pão Francês", 1.50, 100, 0.80);
        Produto bolo = new Produto("A002", "Bolo de Chocolate", 15.00, 10, 8.00);

        Estoque estoque = new Estoque();
        estoque.adicionarProduto(pao);
        estoque.adicionarProduto(bolo);

        // --- 2. Cadastro de Clientes ---
        Cliente cliente1 = new Cliente("12345678901", "João Silva", "Rua das Flores, 123", "987654321");
        Cliente cliente2 = new Cliente("98765432100", "Maria Oliveira", "Avenida Brasil, 456", "912345678");

        // --- 3. Emissão de Nota Fiscal ---
        List<Produto> produtosPedido = new ArrayList<>();
        produtosPedido.add(pao); // 3 Pães
        produtosPedido.add(bolo); // 1 Bolo

        NotaFiscal notaFiscal = new NotaFiscal("NF123", cliente1, produtosPedido);
        notaFiscal.emitir();

        // --- 4. Gestão do Estoque (Lista de Produtos Faltando) ---
        estoque.exibirEstoque(); // Exibe o estoque atual

        // Verificando produtos que estão com estoque baixo
        GestaoCompras gestaoCompras = new GestaoCompras(estoque);
        gestaoCompras.sugerirCompras(); // Sugestões de compras

        // --- 5. Contas a Pagar e Receber ---
        GestaoFinanceira gestaoFinanceira = new GestaoFinanceira();
        
        // Adicionando contas a pagar
        Conta contaPagar1 = new Conta("Pagamento de fornecedor", 500.00, new Date());
        gestaoFinanceira.adicionarContaPagar(contaPagar1);

        // Adicionando contas a receber
        Conta contaReceber1 = new Conta("Venda de produtos", 300.00, new Date());
        gestaoFinanceira.adicionarContaReceber(contaReceber1);

        // Exibindo as contas
        gestaoFinanceira.exibirContasPagar();
        gestaoFinanceira.exibirContasReceber();

        // Pagando uma conta
        gestaoFinanceira.pagarConta(contaPagar1);
        System.out.println("\nApós pagamento de conta:");
        gestaoFinanceira.exibirContasPagar();

        // --- 6. Relatórios ---
        Relatorio relatorio = new Relatorio();
        List<NotaFiscal> notasFiscais = new ArrayList<>();
        notasFiscais.add(notaFiscal);

        // Gerando relatório de vendas
        relatorio.gerarRelatorioVendas(notasFiscais);

        // Gerando relatório financeiro
        List<Conta> contasPagar = new ArrayList<>();
        contasPagar.add(contaPagar1);

        List<Conta> contasReceber = new ArrayList<>();
        contasReceber.add(contaReceber1);

        relatorio.gerarRelatorioFinanceiro(contasPagar, contasReceber);
    }
}