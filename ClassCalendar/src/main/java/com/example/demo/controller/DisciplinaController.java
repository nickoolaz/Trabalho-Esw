package com.example.demo.controller;

import com.example.demo.model.Disciplina;
import com.example.demo.service.DisciplinaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DisciplinaController {
    
    @Autowired
    private DisciplinaService disciplinaService;
    
    @GetMapping("/disciplinas")
    public ResponseEntity <List<Disciplina>>listaDisciplinas(){
        return ResponseEntity.status(HttpStatus.OK).body(disciplinaService.listaDisciplinas());
    }
}
