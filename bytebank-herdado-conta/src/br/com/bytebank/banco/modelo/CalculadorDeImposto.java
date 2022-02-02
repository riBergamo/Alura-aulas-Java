package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {
    private double totalImpsoto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImpsoto += valor;
    }

    public double getTotalImposto() {
        return totalImpsoto;
    }
}
