package com.example.demo.service;

import com.example.demo.model.Perfil;
import java.util.List;
import java.util.Optional;

public interface PerfilService {
    
    public List<Perfil> listaPerfils();
    
    public Optional<Perfil> getByIdPerfil(Integer idPerfil);
    
    public Perfil salvaPerfil(Perfil perfil);
    
    public Perfil atualizaPerfil(Perfil perfil);
    
    public void deleteByIdPerfil(Integer idPerfil);
    
}
