package br.com.bytebank.banco.testesMain;

import br.com.bytebank.banco.conta.Conta;
import br.com.bytebank.banco.conta.ContaCorrente;
import br.com.bytebank.banco.exception.SaldoInsuficienteException;

public class TesteSacar {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(22, 5555);
        conta.depositar(200);

        try {
            conta.sacar(200);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
