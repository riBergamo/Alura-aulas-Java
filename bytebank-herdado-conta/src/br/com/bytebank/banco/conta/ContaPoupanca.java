package br.com.bytebank.banco.conta;

import br.com.bytebank.banco.conta.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaPoupança, " + super.toString();
    }

}
