package com.example.demo.service;

import com.example.demo.model.Perfil;
import com.example.demo.repository.PerfilRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilServiceImpl implements PerfilService{
    
    @Autowired
    private PerfilRepository perfilRepository;
    
    @Override
    public List<Perfil> listaPerfils(){
        return perfilRepository.findAll();
    }
    
    @Override
    public Optional<Perfil> getByIdPerfil(Integer idPerfil) {
        return perfilRepository.findById(idPerfil);
    }
   
    @Override
    public Perfil salvaPerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }
    
    @Override
    public Perfil atualizaPerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }
    
    @Override
    public void deleteByIdPerfil(Integer idPerfil) {
        perfilRepository.deleteById(idPerfil);
    }
}
