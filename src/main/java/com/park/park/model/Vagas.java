package com.park.park.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
public class Vagas implements Serializable {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Id
    private long id;

    private int vagaId;
    private long veiculoId;
    private String situacao;

    public void setId(long id) {
        this.id = id;
    }

    public int getVagaId() {
        return vagaId;
    }

    public void setVagaId(int vagaId) {
        this.vagaId = vagaId;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
