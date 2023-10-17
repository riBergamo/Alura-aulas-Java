package br.com.bytebank.banco.testesMain.util;

import br.com.bytebank.banco.cliente.Cliente;
import br.com.bytebank.banco.conta.Conta;
import br.com.bytebank.banco.conta.ContaCorrente;
import br.com.bytebank.banco.conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacao {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        //NumeroDaContaComparator2 comparator = new NumeroDaContaComparator2();//Functions Objectos: objetos criados com o único objetivo de encapsular uma função
        //evitar uso de null no lista.sort()
        lista.sort(null);

        //Collections.sort(lista, new NumeroDaContaComparator());//O mesmo que lista.sort(new ...) e o NumeroDaContaComparator comparator = new ...();
        //Collections.sort(lista);
        //Collections.reverse(lista);

        System.out.println("-----Ordem maior para menor do número da Conta-----");

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }
    }
}

class TitularDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);
    }
}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) { //como a gente quer ordenar a lista
        // 1ºopção
        return  Integer.compare(c1.getNumero(), c2.getNumero());//metodo Integer ja tem um compare

        // 2ºopcção
        //return c1.getNumero() - c2.getNumero();
        /* se o c1 e o c2 dois forem iguais, devolve 0
           se c1 > c2 da positivo
           e se o c1 < c2 d negativo */

        // 3ºopcão, menos enxuta para o msm codigo
        /*if (c1.getNumero() < c2.getNumero()) {
            return -1;
        }
        if (c1.getNumero() > c2.getNumero()) {
            return 1;
        }
        return 0;
         */
}



}
