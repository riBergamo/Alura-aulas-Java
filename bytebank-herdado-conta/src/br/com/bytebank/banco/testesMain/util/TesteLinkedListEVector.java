package br.com.bytebank.banco.testesMain.util;

import br.com.bytebank.banco.conta.Conta;
import br.com.bytebank.banco.conta.ContaCorrente;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//lista duplamente encadeada:Vector
//Collection seria o tipo mais generico das listas
public class TesteLinkedListEVector {
    public static void main(String[] args) {
        Collection<Conta> lista = new Vector<Conta>(); //Usar apenas se preciso, quando tem mais de uma pilha main

        Conta cc1 = new ContaCorrente(11, 11);
        lista.add(cc1);

        System.out.println("Tamanho: " + lista.size());

        //
        List<Conta> lista2 = new LinkedList<Conta>();

    }

}
