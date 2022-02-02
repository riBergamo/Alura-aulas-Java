package br.com.bytebank.banco.modelo;

public interface Tributavel {
    /*Não precisa de public abstract pq por ser uma interface o
    java ja entende que td dentro é publico e abstrato. */
    double getValorImposto();
}
