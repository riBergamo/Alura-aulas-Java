package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma Conta
 *
 * @author Riane Bergamo
 *
 */

public abstract class Conta extends Object implements Comparable<Conta> {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Construtor para inicializar o objeto Conta apartir da agencia e numero
     *
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero) {
        total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    /**
     * Valor precisa ser maior que o saldo
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor); //problema
        }
        this.saldo -= valor;
    }

    public abstract void depositar(double valor);

    public void transferir(double valor, Conta contaDestinatário) throws SaldoInsuficienteException {
        this.sacar(valor);
        contaDestinatário.depositar(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("O valor digitado é negativo.");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int outroNum) {
        if (outroNum <= 0) {
            System.out.println("O valor digitado é negativo.");
            return;
        }
        this.numero = outroNum;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public boolean equals(Object ref) {
        Conta outra = (Conta) ref;                                                                                      //Como o parametro prcisa ser Object a gente tranforma ele em Conta pq Object nao tem agencia nem numero
        if (this.agencia != outra.agencia) {
            return false;
        }

        if(this.numero != outra.numero) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Conta conta) {
        return Double.compare(this.saldo, conta.saldo);
    }

    @Override
    public String toString() {
        return "Agência: " + this.agencia + ", Número: " + this.numero + ", Saldo: " + this.saldo;
    }



}
