package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        /*
        Conta cc1 = new ContaCorrente(11, 11);
        Conta cc2 = new ContaCorrente(11, 22);

        boolean eIgual = cc1.eIgual(cc2);
        System.out.println(eIgual);
        */

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(11, 11);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(11, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(11, 33);
        boolean existe = lista.contains(cc3);                                                                           //1 - Dentro do método contains() o arrayList aproveita o equals sobrescrito na classe Conta
                                                                                                                        //2 - Pra saber se ja existe um elemento igual
        System.out.println("Já existe: " + existe);

        for(Conta conta : lista) {                                                                                      //Para cada elemento da lista vai faze oq tiver entre {}
            System.out.println(conta);                                                                                  //Isso so funciona por causa dos <> depois de ArrayList
        }

    }
}
