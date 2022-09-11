package com.upjavago.ingresoegreso.service;

import com.upjavago.ingresoegreso.entity.Movimiento;

import java.util.List;

public interface IMovimientoService {

    public Movimiento findById(int id);

    public List<Movimiento> findAll();

    public Movimiento createMovimiento(Movimiento movimiento);

    public Movimiento updateMovimiento(int id, Movimiento movimiento);

    public void deleteMovimiento(int id);

}
