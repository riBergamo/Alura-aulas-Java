package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.SaldoInsuficienteException;                                                         // * : importa todas as classes que estao dentro de modelo
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        //Full qualified name FQN (br.com.bytebank.banco.modelo.)
        ContaCorrente cc = new ContaCorrente(22, 1111);
        cc.depositar(100.0);

        ContaPoupanca cp = new ContaPoupanca(11, 2222);
        cp.depositar(200.0);

        cc.transferir(10.0, cp);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
