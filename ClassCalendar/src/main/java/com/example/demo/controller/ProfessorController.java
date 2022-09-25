package com.example.demo.controller;

import com.example.demo.model.Professor;
import com.example.demo.service.ProfessorService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @GetMapping ("professor/{id_professor}")
    public ResponseEntity<Optional<Professor>> getByIdProfessor (@PathVariable Integer id_professor){
        return ResponseEntity.status(HttpStatus.OK).body(professorService.getByIdProfessor(id_professor));
    }
    
    @PostMapping("professor")
    public ResponseEntity<Professor> salvaProfessor (@RequestBody Professor professor){
        return ResponseEntity.status(HttpStatus.CREATED).body(professorService.salvaProfessor(professor));
    } 
    
    @PutMapping("professor")
    public ResponseEntity<Professor> atualizaProfessor (@RequestBody Professor professor){
        return ResponseEntity.status(HttpStatus.OK).body(professorService.atualizaProfessor(professor));
    }
    
    @DeleteMapping("professor/{id_professor}")
    public ResponseEntity<String> deleteByIdProfessor(@PathVariable Integer id_professor){
        professorService.deleteByIdProfessor(id_professor);
        return ResponseEntity.status(HttpStatus.OK).body("Professor removido com sucesso");
    }
}
