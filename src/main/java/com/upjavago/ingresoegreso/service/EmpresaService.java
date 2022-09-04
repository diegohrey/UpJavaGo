package com.upjavago.ingresoegreso.service;

import com.upjavago.ingresoegreso.entity.Empresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService implements IEmpresaService{

    @Override
    public Empresa findById(int id) {
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(1);
        empresa.setNombre("Coca-Cola");
        empresa.setDireccion("Autopista giron km 4");
        empresa.setTelefono("6076559595");
        empresa.setNit("800.526.236-1");
        return empresa;
    }

    @Override
    public List<Empresa> findAll() {
        List<Empresa> empresas = new ArrayList<Empresa>();

        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNombre("Coca-Cola");
        empresa1.setDireccion("Autopista giron km 4");
        empresa1.setTelefono("6076559595");
        empresa1.setNit("800.526.236-1");

        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(2);
        empresa2.setNombre("Pesip-Cola");
        empresa2.setDireccion("Autopista AguadeDios km 5");
        empresa2.setTelefono("6077550023");
        empresa2.setNit("800.556.111-3");

        empresas.add(empresa1);
        empresas.add(empresa2);
        return empresas;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        Empresa newEmpresa = new Empresa();
        newEmpresa.setIdEmpresa(empresa.getIdEmpresa());
        newEmpresa.setNombre(empresa.getNombre());
        newEmpresa.setDireccion(empresa.getDireccion());
        newEmpresa.setTelefono(empresa.getTelefono());
        newEmpresa.setNit(empresa.getNit());
        return newEmpresa;
    }

    @Override
    public Empresa updateEmpresa(int id, Empresa empresa) {
        Empresa actualizarEmpresa = findById(id);
        actualizarEmpresa.setNombre(empresa.getNombre());
        actualizarEmpresa.setDireccion(empresa.getDireccion());
        actualizarEmpresa.setTelefono(empresa.getTelefono());
        actualizarEmpresa.setNit(empresa.getNit());
        return actualizarEmpresa;
    }

    @Override
    public void deleteEmpresa(int id) {
        Empresa delEmpresa = findById(id);
        System.out.println("se elimino la empresa: " + delEmpresa.toString());
    }
}
