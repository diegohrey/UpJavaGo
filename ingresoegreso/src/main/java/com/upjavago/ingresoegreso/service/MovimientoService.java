package com.upjavago.ingresoegreso.service;

import com.upjavago.ingresoegreso.entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoService implements IMovimientoService{
    @Override
    public Movimiento findById(int id) {

        Movimiento movimiento = new Movimiento();
        movimiento.setIdMovimiento(1);
        movimiento.setMonto(186500.96);
        TipoMovimiento tipoMovimiento = TipoMovimiento.Ingreso;
        movimiento.setTipoMovimiento(tipoMovimiento);
        movimiento.setConcepto("Ingreso por venta de cuadernos");
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1);
        usuario.setNombre("Lian Rincon");
        usuario.setCorreo("lian@micorreo.com");
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(1);
        empresa.setNombre("Coca-Cola");
        empresa.setDireccion("Autopista giron km 4");
        empresa.setTelefono("6076559595");
        empresa.setNit("800.526.236-1");
        usuario.setEmpresa(empresa);
        TipoRol tipoRol = TipoRol.administrador;
        usuario.setRol(tipoRol);
        movimiento.setUsuario(usuario);

        return movimiento;
    }

    @Override
    public List<Movimiento> findAll() {
        List<Movimiento> movimientos = new ArrayList<Movimiento>();

        Movimiento movimiento1 = new Movimiento();
        movimiento1.setIdMovimiento(1);
        movimiento1.setMonto(186500.96);
        TipoMovimiento tipoMovimiento = TipoMovimiento.Ingreso;
        movimiento1.setTipoMovimiento(tipoMovimiento);
        movimiento1.setConcepto("Ingreso por venta de cuadernos");
        Usuario usuario1 = new Usuario();
        usuario1.setIdUsuario(1);
        usuario1.setNombre("Lian Rincon");
        usuario1.setCorreo("lian@micorreo.com");
        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNombre("Coca-Cola");
        empresa1.setDireccion("Autopista giron km 4");
        empresa1.setTelefono("6076559595");
        empresa1.setNit("800.526.236-1");
        usuario1.setEmpresa(empresa1);
        TipoRol tipoRol = TipoRol.administrador;
        usuario1.setRol(tipoRol);
        movimiento1.setUsuario(usuario1);

        Movimiento movimiento2 = new Movimiento();
        movimiento2.setIdMovimiento(2);
        movimiento2.setMonto(590900.96);
        TipoMovimiento tipoMovimiento2 = TipoMovimiento.Ingreso;
        movimiento2.setTipoMovimiento(tipoMovimiento2);
        movimiento2.setConcepto("Ingreso por venta de lapices");
        Usuario usuario2 = new Usuario();
        usuario2.setIdUsuario(2);
        usuario2.setNombre("Diego Rey");
        usuario2.setCorreo("diego@micorreo.com");
        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(2);
        empresa2.setNombre("Pesip-Cola");
        empresa2.setDireccion("Autopista AguadeDios km 5");
        empresa2.setTelefono("6077550023");
        empresa2.setNit("800.556.111-3");
        usuario2.setEmpresa(empresa2);
        TipoRol tipoRol2 = TipoRol.operativo;
        usuario2.setRol(tipoRol2);
        movimiento2.setUsuario(usuario2);

        movimientos.add(movimiento1);
        movimientos.add(movimiento2);
        return movimientos;
    }

    @Override
    public Movimiento createMovimiento(Movimiento movimiento) {

        Movimiento newMovimiento = new Movimiento();
        newMovimiento.setIdMovimiento(movimiento.getIdMovimiento());
        newMovimiento.setMonto(movimiento.getMonto());
        newMovimiento.setTipoMovimiento(movimiento.getTipoMovimiento());
        newMovimiento.setConcepto(movimiento.getConcepto());
        newMovimiento.setUsuario(movimiento.getUsuario());
        return newMovimiento;
    }
    @Override
    public Movimiento updateMovimiento(int id, Movimiento movimiento) {

        Movimiento actualizarMovimiento = findById(id);
        actualizarMovimiento.setMonto(movimiento.getMonto());
        actualizarMovimiento.setTipoMovimiento(movimiento.getTipoMovimiento());
        actualizarMovimiento.setConcepto(movimiento.getConcepto());
        actualizarMovimiento.setUsuario(movimiento.getUsuario());

        return actualizarMovimiento;
    }

    @Override
    public void deleteMovimiento(int id) {
        Movimiento delMovimiento = findById(id);
        System.out.println("se elimino el movimiento: " + delMovimiento.toString());

    }
}
