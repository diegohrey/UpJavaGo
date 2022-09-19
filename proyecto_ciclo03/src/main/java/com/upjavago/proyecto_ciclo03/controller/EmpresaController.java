package com.upjavago.proyecto_ciclo03.controller;

import com.upjavago.proyecto_ciclo03.entity.Empresa;
import com.upjavago.proyecto_ciclo03.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaService;

    @PostMapping("/empresa")
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return this.empresaService.crearEmpresa(empresa);
    }

    @GetMapping("/empresa")
    public List<Empresa> findEmpresas() {
        return this.empresaService.buscarTodasLasEmpresas();
    }

    @GetMapping("/empresa/{id}")
    public Empresa findByIdEmpresa(@PathVariable Long id) {
        return this.empresaService.buscarEmpresaPorId(id);
    }

    @DeleteMapping("/empresa/{id}")
    public void deleteEmpresa(@PathVariable Long id) {
        this.empresaService.eliminarEmpresa(id);
    }

    @PutMapping("/empresa/{id}")
    public Empresa updateEmpresa(@PathVariable Long id, @RequestBody Empresa empresa) {
        return this.empresaService.actualizarEmpresa(id, empresa);
    }
}
