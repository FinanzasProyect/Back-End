package pe.edu.upc.projectfinanzastf.dtos;

import pe.edu.upc.projectfinanzastf.entities.Bono;

public class FlujoCajaDTO {

    private int id_flujo;

    private int nroPeriodo;

    private double fechaPago;

    private double cuota;

    private double interes;

    private double amortizacion;

    private double saldo;

    private double flujoEmisor;

    private double flujoBonista;

    private Bono bono;

    public int getId_flujo() {
        return id_flujo;
    }

    public void setId_flujo(int id_flujo) {
        this.id_flujo = id_flujo;
    }

    public int getNroPeriodo() {
        return nroPeriodo;
    }

    public void setNroPeriodo(int nroPeriodo) {
        this.nroPeriodo = nroPeriodo;
    }

    public double getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(double fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getFlujoEmisor() {
        return flujoEmisor;
    }

    public void setFlujoEmisor(double flujoEmisor) {
        this.flujoEmisor = flujoEmisor;
    }

    public double getFlujoBonista() {
        return flujoBonista;
    }

    public void setFlujoBonista(double flujoBonista) {
        this.flujoBonista = flujoBonista;
    }

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }
}
