package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="disciplina")

public class Disciplina implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name= "id_disciplina")
    private Integer idDisciplina;
    
    @Column (name= "materia")
    private String materia;
    
    public Disciplina() {
    }

    public Disciplina(Integer idDisciplina, String materia) {
        this.idDisciplina = idDisciplina;
        this.materia = materia;
    }

    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "idDisciplina=" + idDisciplina + ", materia=" + materia + '}';
    }
    
} 

