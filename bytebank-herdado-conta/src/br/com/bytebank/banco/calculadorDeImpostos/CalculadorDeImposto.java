package br.com.bytebank.banco.calculadorDeImpostos;

import br.com.bytebank.banco.interfaces.Tributavel;

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
