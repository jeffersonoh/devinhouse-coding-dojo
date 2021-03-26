package com.devinhouse.codindojo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "AGENDAMENTOS")
public class Agendamentos implements Serializable {


    private static final long serialVersionUID = 5096250060984315625L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_AGENDAMENTOS", nullable = false)
    private Long cdAgendamento;

    @Column(name = "DT_AGENDAMENTO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAgendamento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CD_CLIENTE")
    private Cliente cliente;

    @Basic(fetch = FetchType.LAZY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CD_EXAME")
    private Exames exames;

    public Date getDtAgendamento() {
        return this.dtAgendamento;
    }

    public void setDtAgendamento(Date dtAgendamento) {
        this.dtAgendamento = dtAgendamento;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Exames getExames() {
        return this.exames;
    }

    public void setExames(Exames exames) {
        this.exames = exames;
    }


    @Override
    public String toString() {
        return "Agendamentos{" + "cdAgendamento=" + cdAgendamento + '\'' + '}';
    }

}
