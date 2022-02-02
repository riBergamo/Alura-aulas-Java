package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;
import br.com.bytebank.banco.modelo.CalculadorDeImposto;

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
