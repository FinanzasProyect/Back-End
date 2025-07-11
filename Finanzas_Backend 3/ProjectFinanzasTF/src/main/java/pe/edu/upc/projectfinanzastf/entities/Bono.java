package pe.edu.upc.projectfinanzastf.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Bono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_bono;

    @Column(name = "nombre_valoracion", length = 100, nullable = true) // Lo hacemos opcional por si acaso
    private String nombreValoracion;

    @Column(name = "valorNominal", nullable = false)
    private double valorNominal;

    @Column(name = "valorComercial", nullable = false)
    private double valorComercial;

    @Column(name = "tasadsctoCOK", nullable = false)
    private double tasadsctoCOK;

    @Column(name = "impsRenta", nullable = false)
    private double impsRenta;

    @Column(name = "moneda",length = 45, nullable = false)
    private String moneda;

    @Column(name = "fechaEmision", nullable = false)
    private LocalDate fechaEmision;

    @Column(name = "frecuenciaPago", nullable = false)
    private int frecuenciaPago;

    @Column(name = "nroAnios", nullable = false)
    private int nroAnios;

    @Column(name = "tasa", nullable = false)
    private double tasa;

    @Column(name = "tipoTasa",length = 45, nullable = false)
    private String tipoTasa;

    @Column(name = "capitalizacion", nullable = true)
    private int capitalizacion;


    @Column(name = "tipoGracia",length = 45, nullable = true)
    private String tipoGracia;

    @Column(name = "nroPeriodosGracia", nullable = true)
    private int nroPeriodosGracia;


    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    //mapeo desde la valoración en bd
    /*@OneToOne(mappedBy = "bono", cascade = CascadeType.ALL)
    private ValoracionBono valoracion;*/

    public Bono() {
    }

    public Bono(int id_bono,String nombreValoracion, double valorNominal, double valorComercial, double tasadsctoCOK, double impsRenta, String moneda, LocalDate fechaEmision, int frecuenciaPago, int nroAnios, double tasa, String tipoTasa, int capitalizacion, String tipoGracia, int nroPeriodosGracia, Usuario usuario) {
        this.id_bono = id_bono;
        this.nombreValoracion = nombreValoracion;
        this.valorNominal = valorNominal;
        this.valorComercial = valorComercial;
        this.tasadsctoCOK = tasadsctoCOK;
        this.impsRenta = impsRenta;
        this.moneda = moneda;
        this.fechaEmision = fechaEmision;
        this.frecuenciaPago = frecuenciaPago;
        this.nroAnios = nroAnios;
        this.tasa = tasa;
        this.tipoTasa = tipoTasa;
        this.capitalizacion = capitalizacion;
        this.tipoGracia = tipoGracia;
        this.nroPeriodosGracia = nroPeriodosGracia;
        this.usuario = usuario;
    }

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
