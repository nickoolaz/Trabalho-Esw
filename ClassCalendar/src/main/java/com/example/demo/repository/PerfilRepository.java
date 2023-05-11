package com.example.demo.repository;

import com.example.demo.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PerfilRepository extends JpaRepository <Perfil, Integer>{
    public static class findAll{
    
        public findAll(){
        }
    }
}
