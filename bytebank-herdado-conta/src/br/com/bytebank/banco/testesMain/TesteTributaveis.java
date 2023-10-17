package br.com.bytebank.banco.testesMain;

import br.com.bytebank.banco.conta.ContaCorrente;
import br.com.bytebank.banco.cliente.SeguroDeVida;
import br.com.bytebank.banco.calculadorDeImpostos.CalculadorDeImposto;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(58, 1515);
        cc.depositar(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto ci = new CalculadorDeImposto();
        ci.registra(cc);
        ci.registra(seguro);

        System.out.println(ci.getTotalImposto());
    }
}
