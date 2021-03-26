package com.devinhouse.codindojo.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable{

    private static final long serialVersionUID = 413832514697908750L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_CLIENTE", nullable = false)
    private Long cdCliente;

    @Column(name = "NOME", length = 255, nullable = false)
    private String nome;

    @Column(name = "CPF", length = 14, nullable = false)
    private String cpf;

    @Column(name = "DT_NASCIMENTO", length = 14, nullable = false)
    private String dtNascimento;

    
    public Long getCdCliente() {
        return this.cdCliente;
    }

    public void setCdCliente(Long cdCliente) {
        this.cdCliente = cdCliente;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getDtNascimento() {
        return this.dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cdCliente=" + cdCliente + ", nome='" + nome + '\'' + '}';
    }

}
