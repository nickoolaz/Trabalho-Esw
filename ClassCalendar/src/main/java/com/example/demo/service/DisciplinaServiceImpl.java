package com.example.demo.service;

import com.example.demo.model.Disciplina;
import com.example.demo.repository.DisciplinaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaServiceImpl implements DisciplinaService{
    
    @Autowired
    private DisciplinaRepository disciplinaRepository;
    
    @Override
    public List<Disciplina> listaDisciplinas(){
        return disciplinaRepository.findAll();
    }
}
