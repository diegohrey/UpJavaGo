package com.upjavago.proyecto_ciclo03.entity;

import javax.persistence.*;

@Entity
@Table(name = "movimientos")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimiento")
    private long idMovimiento;

    @Column(name = "monto", nullable = false)
    private double monto;

    //private TipoMovimiento tipoMovimiento;

    private String concepto;

    //private Usuario usuario;
}
