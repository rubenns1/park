package com.park.park.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Time;

@Entity
public class Veiculos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String tipo;
    private String fabricante;
    private String modelo;
    private String placa;
    private Time permanencia;

    public Time getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(Time permanencia) {
        this.permanencia = permanencia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
