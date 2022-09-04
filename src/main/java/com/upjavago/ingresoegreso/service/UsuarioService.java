package com.upjavago.ingresoegreso.service;

import com.upjavago.ingresoegreso.entity.Empresa;
import com.upjavago.ingresoegreso.entity.TipoRol;
import com.upjavago.ingresoegreso.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

    @Override
    public Usuario findById(int id) {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1);
        usuario.setNombre("Lian Rincon");
        usuario.setCorreo("lian@micorreo.com");
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(1);
        empresa.setNombre("Coca-Cola");
        empresa.setDireccion("Autopista giron km 4");
        empresa.setTelefono("6076559595");
        empresa.setNit("800.526.236-1");
        usuario.setEmpresa(empresa);
        TipoRol tipoRol = TipoRol.administrador;
        usuario.setRol(tipoRol);

        return usuario;
    }

    @Override
    public List<Usuario> findAll() {

        List<Usuario> usuarios = new ArrayList<Usuario>();

        Usuario usuario1 = new Usuario();
        usuario1.setIdUsuario(1);
        usuario1.setNombre("Lian Rincon");
        usuario1.setCorreo("lian@micorreo.com");
        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNombre("Coca-Cola");
        empresa1.setDireccion("Autopista giron km 4");
        empresa1.setTelefono("6076559595");
        empresa1.setNit("800.526.236-1");
        usuario1.setEmpresa(empresa1);
        TipoRol tipoRol1 = TipoRol.administrador;
        usuario1.setRol(tipoRol1);

        Usuario usuario2 = new Usuario();
        usuario2.setIdUsuario(2);
        usuario2.setNombre("Diego Rey");
        usuario2.setCorreo("diego@micorreo.com");
        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(2);
        empresa2.setNombre("Pesip-Cola");
        empresa2.setDireccion("Autopista AguadeDios km 5");
        empresa2.setTelefono("6077550023");
        empresa2.setNit("800.556.111-3");
        usuario2.setEmpresa(empresa2);
        TipoRol tipoRol2 = TipoRol.operativo;
        usuario2.setRol(tipoRol2);

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        return usuarios;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        Usuario newUsuario = new Usuario();
        newUsuario.setIdUsuario(usuario.getIdUsuario());
        newUsuario.setNombre(usuario.getNombre());
        newUsuario.setCorreo(usuario.getCorreo());
        newUsuario.setEmpresa(usuario.getEmpresa());
        newUsuario.setRol(usuario.getRol());
        return newUsuario;
    }

    @Override
    public Usuario updateUsuario(int id, Usuario usuario) {
        Usuario actualizarUsuario = findById(id);
        actualizarUsuario.setNombre(usuario.getNombre());
        actualizarUsuario.setCorreo(usuario.getCorreo());
        actualizarUsuario.setEmpresa(usuario.getEmpresa());
        actualizarUsuario.setRol(usuario.getRol());
        return actualizarUsuario;
    }

    @Override
    public void deleteUsuario(int id) {
        Usuario delUsuario = findById(id);
        System.out.println("se elimino el usuario: " + delUsuario.toString());
    }
}
