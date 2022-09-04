package com.upjavago.ingresoegreso.entity;

public class Movimiento {

    private long idMovimiento;
    private double monto;
    private TipoMovimiento tipoMovimiento;
    private String concepto;
    private Usuario usuario;

    public Movimiento() {
    }

    public Movimiento(long idMovimiento, double monto, TipoMovimiento tipoMovimiento, String concepto, Usuario usuario) {
        this.idMovimiento = idMovimiento;
        this.monto = monto;
        this.tipoMovimiento = tipoMovimiento;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public long getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimiento=" + idMovimiento +
                ", monto=" + monto +
                ", tipoMovimiento='" + tipoMovimiento + '\'' +
                ", concepto='" + concepto + '\'' +
                ", empleado=" + usuario +
                '}';
    }
}
