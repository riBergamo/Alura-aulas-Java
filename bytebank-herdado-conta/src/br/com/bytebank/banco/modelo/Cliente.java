package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um cliente no bytebank
 *
 * @author Riane bergamo
 *
 * @version 0.1
 *
 */

public class Cliente {
    private String nome;
    private String profissao;
    private String cpf;
    private Endereco endereco = new Endereco();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

}
