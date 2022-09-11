package com.upjavago.ingresoegreso.service;

import com.upjavago.ingresoegreso.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    public Usuario findById(int id);

    public List<Usuario> findAll();

    public Usuario createUsuario(Usuario usuario);

    public Usuario updateUsuario(int id, Usuario usuario);

    public void deleteUsuario(int id);

}
