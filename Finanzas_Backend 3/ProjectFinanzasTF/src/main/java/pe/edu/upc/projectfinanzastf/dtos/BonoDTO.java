package pe.edu.upc.projectfinanzastf.dtos;
import pe.edu.upc.projectfinanzastf.entities.Usuario;
import pe.edu.upc.projectfinanzastf.entities.ValoracionBono;

import java.time.LocalDate;

public class BonoDTO {

    private int id_bono;

    private String nombreValoracion;

    private double valorNominal;

    private double valorComercial;

    private double tasadsctoCOK;

    private double impsRenta;

    private String moneda;

    private LocalDate fechaEmision; //ingresar exacto

    private int frecuenciaPago; //ingresar en dias semestral=180dias

    private int nroAnios;

    private double tasa;

    private String tipoTasa; // "Efectiva" o "Nominal"

    private int capitalizacion; // Solo si es nominal q aparezca

    private String tipoGracia; // "TOTAL", "PARCIAL", "NINGUNA" //solo esas

    private int nroPeriodosGracia; //solo se aplican al inicio pero q se indique la cantidad <=CANTPERIODOSTOTALES

    private Usuario usuario;


    public int getId_bono() {
        return id_bono;
    }

    public void setId_bono(int id_bono) {
        this.id_bono = id_bono;
    }

    public double getValorNominal() {
        return valorNominal;
    }

    public void setValorNominal(double valorNominal) {
        this.valorNominal = valorNominal;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public double getTasadsctoCOK() {
        return tasadsctoCOK;
    }

    public void setTasadsctoCOK(double tasadsctoCOK) {
        this.tasadsctoCOK = tasadsctoCOK;
    }

    public double getImpsRenta() {
        return impsRenta;
    }

    public void setImpsRenta(double impsRenta) {
        this.impsRenta = impsRenta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getFrecuenciaPago() {
        return frecuenciaPago;
    }

    public void setFrecuenciaPago(int frecuenciaPago) {
        this.frecuenciaPago = frecuenciaPago;
    }

    public int getNroAnios() {
        return nroAnios;
    }

    public void setNroAnios(int nroAnios) {
        this.nroAnios = nroAnios;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public String getTipoTasa() {
        return tipoTasa;
    }

    public void setTipoTasa(String tipoTasa) {
        this.tipoTasa = tipoTasa;
    }

    public int getCapitalizacion() {
        return capitalizacion;
    }

    public void setCapitalizacion(int capitalizacion) {
        this.capitalizacion = capitalizacion;
    }

    public String getTipoGracia() {
        return tipoGracia;
    }

    public void setTipoGracia(String tipoGracia) {
        this.tipoGracia = tipoGracia;
    }

    public int getNroPeriodosGracia() {
        return nroPeriodosGracia;
    }

    public void setNroPeriodosGracia(int nroPeriodosGracia) {
        this.nroPeriodosGracia = nroPeriodosGracia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombreValoracion() {
        return nombreValoracion;
    }

    public void setNombreValoracion(String nombreValoracion) {
        this.nombreValoracion = nombreValoracion;
    }

}
