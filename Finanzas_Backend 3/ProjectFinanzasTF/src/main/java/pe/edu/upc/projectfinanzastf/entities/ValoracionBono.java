package pe.edu.upc.projectfinanzastf.entities;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class ValoracionBono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_valoracion;

    @Column(name = "tcea", nullable = false)
    private double tcea;

    @Column(name = "trea", nullable = false)
    private double trea;

    @Column(name = "duracion", nullable = false)
    private double duracion;

    @Column(name = "duracionModificada", nullable = false)
    private double duracionModificada;

    @Column(name = "convexidad", nullable = false)
    private double convexidad;

    @Column(name = "precioMaximo", nullable = false)
    private double precioMaximo;

    @OneToOne
    private Bono bono;

    public ValoracionBono() {
    }

    public ValoracionBono(int id_valoracion, double tcea, double trea, double duracion, double duracionModificada, double convexidad, double precioMaximo, Bono bono) {
        this.id_valoracion = id_valoracion;
        this.tcea = tcea;
        this.trea = trea;
        this.duracion = duracion;
        this.duracionModificada = duracionModificada;
        this.convexidad = convexidad;
        this.precioMaximo = precioMaximo;
        this.bono = bono;
    }

    public int getId_valoracion() {
        return id_valoracion;
    }

    public void setId_valoracion(int id_valoracion) {
        this.id_valoracion = id_valoracion;
    }

    public double getTcea() {
        return tcea;
    }

    public void setTcea(double tcea) {
        this.tcea = tcea;
    }

    public double getTrea() {
        return trea;
    }

    public void setTrea(double trea) {
        this.trea = trea;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getDuracionModificada() {
        return duracionModificada;
    }

    public void setDuracionModificada(double duracionModificada) {
        this.duracionModificada = duracionModificada;
    }

    public double getConvexidad() {
        return convexidad;
    }

    public void setConvexidad(double convexidad) {
        this.convexidad = convexidad;
    }

    public double getPrecioMaximo() {
        return precioMaximo;
    }

    public void setPrecioMaximo(double precioMaximo) {
        this.precioMaximo = precioMaximo;
    }

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }
}
