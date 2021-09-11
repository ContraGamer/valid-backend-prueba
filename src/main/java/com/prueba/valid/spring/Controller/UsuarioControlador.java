package com.prueba.valid.spring.Controller;


import com.prueba.valid.spring.Model.Usuario;
import com.prueba.valid.spring.Repository.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/valid")
public class UsuarioControlador {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @GetMapping(path = "/listAll")
    public @ResponseBody Iterable<Usuario> obtenerTodosUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @PostMapping(path = "/getUser")
    public @ResponseBody Usuario obtenerUsuario(@RequestAttribute int id) {
        System.out.println(id);
        return usuarioRepositorio.findById(id).get();
    }

    @PostMapping(path = "/addUpdate")
    public @ResponseBody Usuario agregarActualizarUsuario(@RequestBody Usuario usuario) {
        usuarioRepositorio.save(usuario);
        System.out.println("Usuario Actualizado");
        return usuarioRepositorio.findById(usuario.getId()).get();
    }

    @PostMapping(path = "/delete")
    public @ResponseBody String eliminarUsuario(@RequestBody Usuario usuario) {
        usuarioRepositorio.delete(usuario);
        return "Usuario Eliminado";
    }

}
