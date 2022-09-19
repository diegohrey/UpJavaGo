package com.upjavago.proyecto_ciclo03.controller;

import com.upjavago.proyecto_ciclo03.entity.Usuario;
import com.upjavago.proyecto_ciclo03.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("/usuario")
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.crearUsuario(usuario);
    }

    @GetMapping("/usuario")
    public List<Usuario> findUsuarios() {
        return this.usuarioService.buscarTodosLosUsuarios();
    }

    @GetMapping("/usuario/{id}")
    public Usuario findByIdUsuario(@PathVariable Long id) {
        return this.usuarioService.buscarUsuarioPorId(id);
    }

    @DeleteMapping("/usuario/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        this.usuarioService.eliminarUsuario(id);
    }

    @PutMapping("/usuario/{id}")
    public Usuario updateEmpresa(@PathVariable Long id, @RequestBody Usuario usuario) {
        return this.usuarioService.actualizarUsuario(id, usuario);
    }
}