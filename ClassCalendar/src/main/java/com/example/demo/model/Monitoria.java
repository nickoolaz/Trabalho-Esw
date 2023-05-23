package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "monitoria")

public class Monitoria implements Serializable{
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   @Column (name = "id_monitoria")
   private Integer idMonitoria;
  
   @Column (name ="estado")
   private Boolean estado;
  
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

   public Monitoria(Integer idMonitoria, Boolean estado, String feedback, Aluno aluno, Professor professor) {
       this.idMonitoria = idMonitoria;
       this.estado = estado;
       this.feedback = feedback;
       this.aluno = aluno;
       this.professor = professor;
   }

   public Integer getIdMonitoria() {
       return idMonitoria;
   }

   public Boolean getEstado() {
       return estado;
   }

   public void setEstado(Boolean estado) {
       this.estado = estado;
   }

   public String getFeedback() {
       return feedback;
   }

   public void setFeedback(String feedback) {
       this.feedback = feedback;
   }

   public Aluno getAluno() {
       return aluno;
   }

   public void setAluno(Aluno aluno) {
       this.aluno = aluno;
   }

   public Professor getProfessor() {
       return professor;
   }

   public void setProfessor(Professor professor) {
       this.professor = professor;
   }

   @Override
   public String toString() {
       return "Monitoria{" + "idMonitoria=" + idMonitoria + ", estado=" + estado + ", feedback=" + feedback + ", aluno=" + aluno + ", professor=" + professor + '}';
   }
    
}