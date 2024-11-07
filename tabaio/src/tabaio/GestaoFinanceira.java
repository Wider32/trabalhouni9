package tabaio;

import java.util.ArrayList;
import java.util.List;

public class GestaoFinanceira {
    private List<Conta> contasPagar;
    private List<Conta> contasReceber;

    public GestaoFinanceira() {
        contasPagar = new ArrayList<>();
        contasReceber = new ArrayList<>();
    }

    public void adicionarContaPagar(Conta conta) {
        contasPagar.add(conta);
    }

    public void adicionarContaReceber(Conta conta) {
        contasReceber.add(conta);
    }

    public void pagarConta(Conta conta) {
        conta.pagar();
    }

    public void exibirContasPagar() {
        for (Conta conta : contasPagar) {
            System.out.println(conta);
        }
    }

    public void exibirContasReceber() {
        for (Conta conta : contasReceber) {
            System.out.println(conta);
        }
    }
}