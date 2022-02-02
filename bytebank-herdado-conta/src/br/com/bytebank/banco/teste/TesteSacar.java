package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

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
