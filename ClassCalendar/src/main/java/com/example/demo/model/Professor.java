
package com.example.demo.model;

public class Professor {
   private Integer idProfessor;
   private String  cpf;
   private String  nome;
   private String  telefone;
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

    @Override
    public String toString() {
        return "Professor{" + "idProfessor=" + idProfessor + ", cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + '}';
    }
    
}






 

