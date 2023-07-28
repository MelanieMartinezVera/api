package com.example.BD.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Ferrari")
public class carrosModel {
    @Id
    @GeneratedValue
    @Column(unique = true, nullable = false)
    private int Id;
    private String tipo;
    private String modelo;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
