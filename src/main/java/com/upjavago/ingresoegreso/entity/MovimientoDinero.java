package com.upjavago.ingresoegreso.entity;

public class MovimientoDinero {

    private long idMovimiento;
    private double monto;
    private String tipoMovimiento;
    private String concepto;
    private Empleado empleado;

    public MovimientoDinero() {
    }

    public MovimientoDinero(long idMovimiento, double monto, String tipoMovimiento, String concepto, Empleado empleado) {
        this.idMovimiento = idMovimiento;
        this.monto = monto;
        this.tipoMovimiento = tipoMovimiento;
        this.concepto = concepto;
        this.empleado = empleado;
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

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimiento=" + idMovimiento +
                ", monto=" + monto +
                ", tipoMovimiento='" + tipoMovimiento + '\'' +
                ", concepto='" + concepto + '\'' +
                ", empleado=" + empleado +
                '}';
    }
}
