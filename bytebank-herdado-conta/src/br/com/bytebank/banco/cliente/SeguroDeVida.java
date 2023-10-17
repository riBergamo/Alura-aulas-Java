package br.com.bytebank.banco.cliente;

import br.com.bytebank.banco.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
