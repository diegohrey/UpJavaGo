package com.upjavago.ingresoegreso.controller;

import com.upjavago.ingresoegreso.entity.Empresa;
import com.upjavago.ingresoegreso.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaService;

    @GetMapping("/empresa/{id}")
    public Empresa buscarEmpresa(@PathVariable int id){
        return empresaService.findById(id);
    }

    @GetMapping("/empresa")
    public List<Empresa> listarEmpresas(){
        return empresaService.findAll();
    }

    @PostMapping("/empresa")
    public Empresa crearEmpresa(@RequestBody Empresa empresa){
        return empresaService.createEmpresa(empresa);
    }

    @PatchMapping("/empresa/{id}")
    public Empresa actualizarEmpresa(@PathVariable int id, @RequestBody Empresa empresa){
        return empresaService.updateEmpresa(id, empresa);
    }

    @DeleteMapping("/empresa/{id}")
    public void borrarEmpresa(@PathVariable int id){
        empresaService.deleteEmpresa(id);
    }
}
