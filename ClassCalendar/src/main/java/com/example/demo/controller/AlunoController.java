package com.example.demo.controller;

import com.example.demo.model.Aluno;
import com.example.demo.service.AlunoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
