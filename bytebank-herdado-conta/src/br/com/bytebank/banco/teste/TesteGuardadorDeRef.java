package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencia;

public class TesteGuardadorDeRef {
    public static void main(String[] args) {
        GuardadorDeReferencia g = new GuardadorDeReferencia();

        Conta cc = new ContaCorrente(22,33);
        g.adiciona(cc);

        Conta cc1 = new ContaCorrente(22,44);
        g.adiciona(cc1);
        //sempre que chama o método adiciona() a posicaoLivre recebe mais 1,
        // assim posicaoLivre mostra a quantDeElementos dentro do array.

        int tamanho = g.getQuantDeElementos();
        System.out.println("Quantidade de elementos: " + tamanho);

        Conta ref = (Conta) g.getReferencia(1);                                                                  // Tem que usar (Conta) pq oq o getReferencia devolve é um Object
        System.out.println(ref);                                                                                        //pro guardador devolver um elemento, recebendo uma ref

    }
}
