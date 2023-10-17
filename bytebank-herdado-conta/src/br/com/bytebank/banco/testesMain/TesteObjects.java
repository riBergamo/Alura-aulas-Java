package br.com.bytebank.banco.testesMain;

import br.com.bytebank.banco.cliente.Cliente;
import br.com.bytebank.banco.conta.Conta;
import br.com.bytebank.banco.conta.ContaCorrente;
import br.com.bytebank.banco.conta.ContaPoupanca;

public class TesteObjects {
    public static void main(String[] args) {
        /*System.out.println("x");
        System.out.println(3);
        System.out.println(false);*/

        Object cc = new ContaCorrente(55, 66);
        Object cp = new ContaPoupanca(55, 77);
        Cliente cliente = new Cliente();

        System.out.println(cc);
        System.out.println(cp);

        println(cliente);


    }

    private static void println(Conta conta) {
    }

    private static void println(Object referencia) {
    }

    private static void println() {
    }

    private static void println(int a) {
    }
}
