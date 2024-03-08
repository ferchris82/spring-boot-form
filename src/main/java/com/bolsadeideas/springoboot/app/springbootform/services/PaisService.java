package com.bolsadeideas.springoboot.app.springbootform.services;

import java.util.List;

import com.bolsadeideas.springoboot.app.springbootform.models.domain.Pais;

public interface PaisService {

    public List<Pais> listar();
    public Pais obtenerPorId(Integer id);
} 
    
