package com.devinhouse.codindojo.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "EXAMES")
public class Exames implements Serializable{

    private static final long serialVersionUID = -339068298189497751L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_EXAME", nullable = false)
    private Long cdExame;

    @Column(name = "DESCRICAO", length = 255, nullable = false)
    private String descricao;

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Exames{" + "cdExame=" + cdExame + ", descricao='" + descricao + '\'' + '}';
    }

}
