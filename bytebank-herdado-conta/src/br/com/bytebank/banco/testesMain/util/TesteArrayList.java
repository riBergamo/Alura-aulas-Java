package br.com.bytebank.banco.testesMain.util;

import br.com.bytebank.banco.conta.Conta;
import br.com.bytebank.banco.conta.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<Conta>();                                                                /* 1- Quando tem <>(generics) é pq o array list so guarda esse tipo(Conta ou filhos da Conta), é mais seguro.
                                                                                                                           2- Guarador de ref, internamente usa um array*/
        Conta cc1 = new ContaCorrente(11, 11);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(11, 22);                                                           //Cria uma ref de Cp para ser guardada no array contas[]
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());                                                                 //Tamanho da lista

        Conta ref = (Conta) lista.get(0);                                                                               //Mostra o elemento dentro da posicao desejada,
                                                                                                                        //É usado quando precisa mostrar um elemento especifico por exemplo apenas o numero ou a agencia da conta
        System.out.println(ref);

        lista.remove(0);
        System.out.println("Tamanho pós remove: " + lista.size());

        ContaCorrente cc3 = new ContaCorrente(11, 33);
        lista.add(cc3);

        ContaCorrente cc4 = new ContaCorrente(11, 44);
        lista.add(cc4);

        /*for (int i = 0; i < lista.size(); i++) {
            Object objectRef = lista.get(i);
            System.out.println(i + ": " + objectRef);
        }*/

        //opçao mais contida/simplificada para o for()
        for(Conta conta : lista) {                                                                                      //Para cada elemento da lista vai faze oq tiver entre {}
            System.out.println(conta);                                                                                  //Isso so funciona por causa dos <> depois de ArrayList
        }

    }
}
