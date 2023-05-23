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
@Table (name = "tecnico")
public class Tecnico implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_tecnico")
    private Integer idTecnico;
    
    @Column (name = "cpf")
    private String cpf;
    
    @Column (name = "nome")
    private String nome;
    
    @Column (name = "telefone")
    private String telefone;
    
    @Column (name = "endereco")
    private String endereco;
    
    @Column (name = "status")
    private Boolean  status;
    
    @Column (name = "senha")
    private String  senha;
    
    @ManyToOne 
    @JoinColumn (name = "id_perfil", referencedColumnName = "id_perfil")
    private Perfil perfil;

    public Tecnico() {
    }

    public Tecnico(Integer idTecnico, Perfil perfil) {
        this.idTecnico = idTecnico;
        this.perfil = perfil;
    }

    public Integer getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "idTecnico=" + idTecnico + ", perfil=" + perfil + '}';
    }

}
