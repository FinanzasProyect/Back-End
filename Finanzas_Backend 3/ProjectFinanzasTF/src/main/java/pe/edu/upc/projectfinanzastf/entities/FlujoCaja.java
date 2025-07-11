package pe.edu.upc.projectfinanzastf.entities;

import jakarta.persistence.*;

@Entity
public class FlujoCaja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_flujo;

    @Column(name = "nroPeriodo", nullable = true)
    private int nroPeriodo;

    @Column(name = "fechaPago", nullable = true)
    private double fechaPago;

    @Column(name = "cuota", nullable = true)
    private double cuota;

    @Column(name = "interes", nullable = true)
    private double interes;

    @Column(name = "amortizacion", nullable = true)
    private double amortizacion;

    @Column(name = "saldo", nullable = true)
    private double saldo;

    @Column(name = "flujoEmisor", nullable = true)
    private double flujoEmisor;

    @Column(name = "flujoBonista", nullable = true)
    private double flujoBonista;

    @ManyToOne
    @JoinColumn(name = "idBono")
    private Bono bono;

    public FlujoCaja() {
    }

    public FlujoCaja(int id_flujo, int nroPeriodo, double fechaPago, double cuota, double interes, double amortizacion, double saldo, double flujoEmisor, double flujoBonista, Bono bono) {
        this.id_flujo = id_flujo;
        this.nroPeriodo = nroPeriodo;
        this.fechaPago = fechaPago;
        this.cuota = cuota;
        this.interes = interes;
        this.amortizacion = amortizacion;
        this.saldo = saldo;
        this.flujoEmisor = flujoEmisor;
        this.flujoBonista = flujoBonista;
        this.bono = bono;
    }

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
