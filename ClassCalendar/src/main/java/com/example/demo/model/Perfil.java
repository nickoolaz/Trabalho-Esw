package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "perfil")

public class Perfil implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_perfil")
    private Integer idPerfil;
    
    @Column (name = "descricao")
    private String descricao;

    public Perfil() {
    }

    public Perfil(Integer idPerfil, String descricao) {
        this.idPerfil = idPerfil;
        this.descricao = descricao;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Perfil{" + "idPerfil=" + idPerfil + ", descricao=" + descricao + '}';
    }
       
}
