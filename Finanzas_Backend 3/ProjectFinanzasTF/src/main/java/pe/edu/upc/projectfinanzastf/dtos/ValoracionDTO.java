package pe.edu.upc.projectfinanzastf.dtos;
import pe.edu.upc.projectfinanzastf.entities.Bono;

public class ValoracionDTO {

    private int id_valoracion;

    private double tcea;

    private double trea;

    private double duracion;

    private double duracionModificada;

    private double convexidad;

    private double precioMaximo;

    private Bono bono;

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
