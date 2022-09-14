package com.example.demo.service;

import com.example.demo.model.Aluno;
import com.example.demo.repository.AlunoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoServiceImpl implements AlunoService{
  
    @Autowired
    private AlunoRepository alunoRepository;
    
    @Override
    public List<Aluno> listaAlunos(){
        return alunoRepository.findAll();
    }
}
