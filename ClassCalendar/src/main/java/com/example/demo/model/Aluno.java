package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name = "aluno")

public class Aluno implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_aluno")
    private Integer idAluno;
    
    @Column (name = "turma")
    private String turma;
    
    @OneToOne
    @JoinColumn (name="id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;

    public Aluno() {
    }

    public Aluno(Integer idAluno, String turma, Usuario usuario) {
        this.idAluno = idAluno;
        this.turma = turma;
        this.usuario = usuario;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Aluno{" + "idAluno=" + idAluno + ", turma=" + turma + ", usuario=" + usuario + '}';
    }

}
