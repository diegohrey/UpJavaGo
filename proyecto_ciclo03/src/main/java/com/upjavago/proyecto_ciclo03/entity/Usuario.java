package com.upjavago.proyecto_ciclo03.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long idUsuario;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    private String correo;

    //private Empresa empresa;

    //private TipoRol rol;
}
