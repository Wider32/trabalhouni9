package tabaio;

import java.util.List;

public class Relatorio {
    public void gerarRelatorioVendas(List<NotaFiscal> notasFiscais) {
        System.out.println("Relatório de Vendas:");
        for (NotaFiscal nf : notasFiscais) {
            nf.emitir();
        }
    }

    public void gerarRelatorioFinanceiro(List<Conta> contasPagar, List<Conta> contasReceber) {
        System.out.println("Relatório Financeiro:");
        System.out.println("Contas a Pagar:");
        for (Conta conta : contasPagar) {
            System.out.println(conta);
        }

        System.out.println("Contas a Receber:");
        for (Conta conta : contasReceber) {
            System.out.println(conta);
        }
    }
}
