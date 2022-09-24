package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "professor")


public class Professor implements Serializable{
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   @Column (name = "id_professor")
   private Integer idProfessor;
 
   @Column (name = "cpf")
   private String  cpf;

   @Column (name = "nome")
   private String  nome;

   @Column (name = "telefone")
   private String  telefone;

   @Column (name = "endereco")
   private String  endereco;

    public Professor() {
    }

    public Professor(Integer idProfessor, String cpf, String nome, String telefone, String endereco) {
        this.idProfessor = idProfessor;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Professor{" + "idProfessor=" + idProfessor + ", cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + '}';
    }
    
}






 

