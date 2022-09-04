package com.upjavago.ingresoegreso.controller;

import com.upjavago.ingresoegreso.entity.Usuario;
import com.upjavago.ingresoegreso.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuario/{id}")
    public Usuario buscarUsuario(@PathVariable int id){
        return usuarioService.findById(id);
    }

    @GetMapping("/usuario")
    public List<Usuario> listarUsuarios(){
        return usuarioService.findAll();
    }

    @PostMapping("/usuario")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioService.createUsuario(usuario);
    }

    @PutMapping("/usuario/{id}")
    public Usuario actualizarUsuario(@PathVariable int id, @RequestBody Usuario usuario){
        return usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public void borrarUsuario(@PathVariable int id){
        usuarioService.deleteUsuario(id);
    }
}
