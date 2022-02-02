package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {
    public static void main(String[] args) {
        Object[] referencias = new Object[5];

        System.out.println(referencias.length);                                                                         //mp

        //
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        //
        ContaPoupanca cc2 = new ContaPoupanca(66, 88);                                                    //cria uma ref de Cp para ser guardada no array contas[]
        referencias[1] = cc2;

        ContaPoupanca ref = (ContaPoupanca) referencias[1];                                                             //type cast : (ContaPoupanca), é um aviso ao compilador que o código vai funcionar
        System.out.println(ref);                                                                                        //opção 1
        System.out.println(referencias[1]);                                                                             //opção 2
        System.out.println(cc2);                                                                                        //opção 3

        //transforma a refGenerica em especifica(Object > ContaCorrente)
        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        ContaCorrente refGenerica = (ContaCorrente) referencias[2];
        System.out.println(refGenerica.getNumero());
        //

    }
}
