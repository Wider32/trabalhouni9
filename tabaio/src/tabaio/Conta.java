package tabaio;

import java.util.Date;

public class Conta {
    private String descricao;
    private double valor;
    private Date data;
    private boolean paga;

    public Conta(String descricao, double valor, Date data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.paga = false;
    }

    public void pagar() {
        this.paga = true;
    }

    public boolean isPaga() {
        return paga;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return descricao + " - R$ " + valor + " - Data: " + data + " - Paga: " + (paga ? "Sim" : "Não");
    }
}