package com.upjavago.proyecto_ciclo03.controller;

import com.upjavago.proyecto_ciclo03.entity.Movimiento;
import com.upjavago.proyecto_ciclo03.service.IMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovimientoController {

    @Autowired
    private IMovimientoService movimientoService;

    @PostMapping("/movimiento")
    public Movimiento createMovimiento(@RequestBody Movimiento movimiento) {
        return this.movimientoService.crearMovimiento(movimiento);
    }

    @GetMapping("/movimiento")
    public List<Movimiento> findMovimientos() {
        return this.movimientoService.buscarTodosLosMovimientos();
    }

    @GetMapping("/movimiento/{id}")
    public Movimiento findByIdMovimiento(@PathVariable Long id) {
        return this.movimientoService.buscarMovimientoPorId(id);
    }

    @DeleteMapping("/movimiento/{id}")
    public void deleteMovimiento(@PathVariable Long id) {
        this.movimientoService.eliminarMovimiento(id);
    }

    @PutMapping("/movimiento/{id}")
    public Movimiento updateMovimiento(@PathVariable Long id, @RequestBody Movimiento movimiento) {
        return this.movimientoService.actualizarMovimiento(id, movimiento);
    }
}