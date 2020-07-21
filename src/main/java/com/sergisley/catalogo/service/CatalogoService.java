package com.sergisley.catalogo.service;

import java.util.List;

import com.sergisley.catalogo.model.Musica;

public interface CatalogoService {
    List<Musica> findAll();
    Musica findById(long id);
    Musica save(Musica musica);    
    void delete(long id);    
}