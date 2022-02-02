package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override//: anotacao no codigo java
    public void sacar(double valor) throws SaldoInsuficienteException {
        double valorAoSacar = valor + 0.20;
        super.sacar(valorAoSacar);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return "ContaCorrente, " + super.toString(); //ele pega a toString() da Conta e não do Object
    }
}
