package com.prueba.valid.spring.Repository;

import com.prueba.valid.spring.Model.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario,Integer>{
    
}
