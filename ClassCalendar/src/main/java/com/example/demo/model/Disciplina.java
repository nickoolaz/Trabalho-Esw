package com.example.demo.model;

public class Disciplina {
    private Integer idDisciplina;
    private String materia;
    private Professor professor;

    public Disciplina() {
    }

    public Disciplina(Integer idDisciplina, String materia, Professor professor) {
        this.idDisciplina = idDisciplina;
        this.materia = materia;
        this.professor = professor;
    }

    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    public String getMateria() {
        return materia;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
} 

