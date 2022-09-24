package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "monitoria")

public class Monitoria implements Serializable{
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  @Column (name = "id_monitoria")
  private Integer idMonitoria;
  
  @Column (name = "inicio_monitoria")
  private long inicioMonitoria;
  
  @Column (name = "fim_monitoria")
  private long fimMonitoria;
  
  @Column (name = "feedback")
  private String feedback;
   
   @ManyToOne 
   @JoinColumn (name = "id_aluno", referencedColumnName = "id_aluno")
   private Aluno aluno;    
   
   @ManyToOne
   @JoinColumn (name = "id_professor", referencedColumnName = "id_professor")
   private Professor professor;
   
    public Monitoria() {
    }

    public Monitoria(int idMonitoria, long inicioMonitoria, long fimMonitoria, String feedback, Aluno aluno/*,Professor professor*/) {
        this.idMonitoria = idMonitoria;
        this.inicioMonitoria = inicioMonitoria;
        this.fimMonitoria = fimMonitoria;
        this.feedback = feedback;
        this.aluno = aluno;
        this.professor = professor;
    }

    public int getIdMonitoria() {
        return idMonitoria;
    }

    public long getInicioMonitoria() {
        return inicioMonitoria;
    }

    public long getFimMonitoria() {
        return fimMonitoria;
    }

    public String getFeedback() {
        return feedback;
    }

    public Aluno getAluno() {
        return aluno;
    }

   public Professor getProfessor() {
        return professor;
    }

    public void setInicioMonitoria(long inicioMonitoria) {
        this.inicioMonitoria = inicioMonitoria;
    }

    public void setFimMonitoria(long fimMonitoria) {
        this.fimMonitoria = fimMonitoria;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Monitoria{" + "idMonitoria=" + idMonitoria + ", inicioMonitoria=" + inicioMonitoria + ", fimMonitoria=" + fimMonitoria + ", feedback=" + feedback + ", aluno=" + aluno + /*", professor=" + professor +*/ '}';
    }
}