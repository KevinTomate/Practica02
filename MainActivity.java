/**
 Ing. En tecnologías de la información
 Grupo:9-3
 Quintero García Kevin Fermín
 Matricula: 2019030369
 Aplicaciones Móviles
 Practica 02
 15/05/2022
 */
package com.example.practica02;

/**
 *
 * @author MM09
 */
class Cotizacion {
    // Atributos
    private int noCotizacion;
    private String descripcionAuto;
    private double precio;
    private double porcentajeInicial;
    private int plazo;

    // Constructores
    public Cotizacion(){
        this.noCotizacion=0;
        this.descripcionAuto ="";
        this.precio = 0.0;
        this.porcentajeInicial =0.0;
        this.plazo= 0;
    }

    // Constructor de Parametros
    public Cotizacion(int numCotizacion, String descripción, double precio, double porcentajePagoInicial, int plazo){
        this.noCotizacion=numCotizacion;
        this.descripcionAuto=descripcionAuto;
        this.precio = precio;
        this.porcentajeInicial=porcentajePagoInicial;
        this.plazo = plazo;
    }

    // Constructor de Copia
    public Cotizacion(Cotizacion cotizacion){
        this.noCotizacion=cotizacion.noCotizacion;
        this.descripcionAuto=cotizacion.descripcionAuto;
        this.precio = cotizacion.precio;
        this.porcentajeInicial=cotizacion.porcentajeInicial;
        this.plazo = cotizacion.plazo;
    }

    // Encapsulamiento

    /**
     * @return the numCotizacion
     */
    public int getNumCotizacion() {
        return noCotizacion;
    }

    /**
     * @param numCotizacion the numCotizacion to set
     */
    public void setNumCotizacion(int numCotizacion) {
        this.noCotizacion=numCotizacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcionAuto;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcionAuto=descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio=precio;
    }

    /**
     * @return the porcentajePagoInicial
     */
    public double getPorcentajePagoInicial() {
        return porcentajeInicial;
    }

    /**
     * @param porcentajePagoInicial the porcentajePagoInicial to set
     */
    public void setPorcentajePagoInicial(double porcentajePagoInicial) {
        this.porcentajeInicial=porcentajePagoInicial;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo=plazo;
    }

    public double calcularPagoInicial(){
        double pagoInicial;
        pagoInicial=(this.porcentajeInicial/100) * this.precio;
        return pagoInicial;
    }

    public double calcularTotalFinanciero(){
        double totalFin;
        totalFin = this.precio - this.calcularPagoInicial();
        return totalFin;
    }
    public double calcularPagoMensual(){
        double pagoMensual;
        pagoMensual=this.calcularTotalFinanciero() / this.plazo;
        return pagoMensual;
    }
}