package com.example.demo.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "professor")
public class Professor implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_professor")
    private Integer idProfessor;
 
    @OneToMany
    @JoinColumn(name = "id_professor")
    private List<Disciplina> disciplinas;
    
    @OneToOne
    @JoinColumn (name="id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;
   
    public Professor() {
    }

    public Professor(Integer idProfessor, Usuario usuario) {
        this.idProfessor = idProfessor;
        this.usuario = usuario;
    }

    public Professor(Integer idProfessor, List<Disciplina> disciplinas, Usuario usuario) {
        this.idProfessor = idProfessor;
        this.disciplinas = disciplinas;
        this.usuario = usuario;
    }
    
    public Integer getIdProfessor() {
        return idProfessor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" + "idProfessor=" + idProfessor + ", disciplinas=" + disciplinas + ", usuario=" + usuario + '}';
    }
 
}






 

