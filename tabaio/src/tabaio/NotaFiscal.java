package tabaio;

import java.util.List;

public class NotaFiscal {
    private String numero;
    private Cliente cliente;
    private List<Produto> produtos;
    private double total;

    public NotaFiscal(String numero, Cliente cliente, List<Produto> produtos) {
        this.numero = numero;
        this.cliente = cliente;
        this.produtos = produtos;
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void emitir1() {
        System.out.println("Emissão de Nota Fiscal:");
        System.out.println("Número: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println("Total: R$ " + total);
    }

	public void emitir() {
		// TODO Auto-generated method stub
		
	}
}
