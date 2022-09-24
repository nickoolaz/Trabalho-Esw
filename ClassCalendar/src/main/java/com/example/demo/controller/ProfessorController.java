package com.example.demo.controller;

import com.example.demo.model.Professor;
import com.example.demo.service.ProfessorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProfessorController {
    
     @Autowired
     private ProfessorService professorService;

     @GetMapping("/professores")
     public ResponseEntity <List<Professor>> ListaProfessores (){
         return ResponseEntity.status (HttpStatus.OK). body(professorService.listaProfessores()); 
    }    
    
}
