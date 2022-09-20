package com.example.demo.controller;

import com.example.demo.model.Aluno;
import com.example.demo.service.AlunoService;
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
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;
    
    @GetMapping("/alunos")
    public ResponseEntity <List<Aluno>> listaAlunos(){
        return ResponseEntity.status(HttpStatus.OK). body(alunoService.listaAlunos());
    }
                                                                            
    @GetMapping("aluno/{id_aluno}")                                                                               
    public ResponseEntity<Optional<Aluno>> getByIdAluno(@PathVariable Integer id_aluno){
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.getByIdAluno(id_aluno));  
    }
    
    @PostMapping("aluno")
    public ResponseEntity<Aluno> salvaAluno(@RequestBody Aluno aluno){
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.salvaAluno(aluno));
    }
    
    @PutMapping("aluno")
    public ResponseEntity<Aluno> atualizaAluno(@RequestBody Aluno aluno){
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.atualizaAluno(aluno));
    }
    
    @DeleteMapping("aluno/{id_aluno}")
    public ResponseEntity<String> deleteByIdAluno(@PathVariable Integer id_aluno){
        alunoService.deleteByIdAluno(id_aluno);
        return ResponseEntity.status(HttpStatus.OK).body("Aluno removido com sucesso");
    }    
}