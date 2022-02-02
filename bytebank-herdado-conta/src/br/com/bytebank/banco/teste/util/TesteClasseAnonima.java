package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteClasseAnonima {

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
        //

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        //NumeroDaContaComparator2 comparator = new NumeroDaContaComparator2();//Functions Objectos: objetos criados com o único objetivo de encapsular uma função
        //evitar uso de null no lista.sort()
        //lista.sort(null);

        //opção 1
        lista.sort(new Comparator<Conta>() { //usar quando o metodo sera usado apenas em uma classe

                @Override
                public int compare(Conta c1, Conta c2) {
                return Integer.compare(c1.getNumero(), c2.getNumero());
                }
            }
        );

        //opção 2, mais enxuta
        Comparator<Conta> comp = new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2) { //ordem alfabetica
                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();

                return nomeC1.compareToIgnoreCase(nomeC2);
            }
        };

        System.out.println(lista);

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}

