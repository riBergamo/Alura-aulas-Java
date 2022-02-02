package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencia {
    private Object[] referencia;
    private int posicaolivre;

    public GuardadorDeReferencia() {
        this.referencia = new Object[10];
        this.posicaolivre = 0;
    }

    public void adiciona(Object ref){
        this.referencia[this.posicaolivre] = ref;
        this.posicaolivre++;
    }

    public int getQuantDeElementos(){
        return this.posicaolivre;
    }

    public Object getReferencia(int posicao) {
        return this.referencia[posicao];
    }

}
