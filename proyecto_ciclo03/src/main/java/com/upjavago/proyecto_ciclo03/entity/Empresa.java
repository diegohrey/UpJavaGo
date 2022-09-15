package com.upjavago.proyecto_ciclo03.entity;

import javax.persistence.*;

@Entity
@Table(name = "empresas")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private long idEmpresa;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    private String direccion;

    private String telefono;

    @Column(name = "nit", nullable = false)
    private String nit;

}
