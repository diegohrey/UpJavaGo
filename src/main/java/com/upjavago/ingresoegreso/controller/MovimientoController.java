package com.upjavago.ingresoegreso.controller;

import com.upjavago.ingresoegreso.entity.Movimiento;
import com.upjavago.ingresoegreso.service.IMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovimientoController {

    @Autowired
    private IMovimientoService movimientoService;

    @GetMapping("/movimiento/{id}")
    public Movimiento buscarMovimiento(@PathVariable int id){
        return movimientoService.findById(id);
    }

    @GetMapping("/movimiento")
    public List<Movimiento> listarMovimientos(){
        return movimientoService.findAll();
    }

    @PostMapping("/movimiento")
    public Movimiento crearMovimiento(@RequestBody Movimiento movimiento){
        return movimientoService.createMovimiento(movimiento);
    }

    @PutMapping("/movimiento/{id}")
    public Movimiento actualizarMovimiento(@PathVariable int id, @RequestBody Movimiento movimiento){
        return movimientoService.updateMovimiento(id, movimiento);
    }

    @DeleteMapping("/movimiento/{id}")
    public void borrarMovimiento(@PathVariable int id){
        movimientoService.deleteMovimiento(id);
    }
}
