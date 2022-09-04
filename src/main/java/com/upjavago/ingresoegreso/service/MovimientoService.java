package com.upjavago.ingresoegreso.service;

import com.upjavago.ingresoegreso.entity.Movimiento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoService implements IMovimientoService{
    @Override
    public Movimiento findById(int id) {
        return null;
    }

    @Override
    public List<Movimiento> findAll() {
        return null;
    }

    @Override
    public Movimiento createMovimiento(Movimiento movimiento) {
        return null;
    }

    @Override
    public Movimiento updateMovimiento(int id, Movimiento movimiento) {
        return null;
    }

    @Override
    public void deleteMovimiento(int id) {

    }
}
