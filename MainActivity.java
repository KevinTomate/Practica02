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
     * @return the noCotizacion
     */
    public int getNoCotizacion() {
        return noCotizacion;
    }

    /**
     * @param noCotizacion the noCotizacion to set
     */
    public void setNoCotizacion(int noCotizacion) {
        this.noCotizacion=noCotizacion;
    }

    /**
     * @return the descripcionAuto
     */
    public String getDescripcionAuto() {
        return descripcionAuto;
    }

    /**
     * @param descripcionAuto the descripcionAuto to set
     */
    public void setDescripcionAuto(String descripcionAuto) {
        this.descripcionAuto=descripcionAuto;
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
     * @param porcentajeInicial the porcentajePagoInicial to set
     */
    public void setPorcentajeInicial(double porcentajeInicial) {
        this.porcentajeInicial=porcentajeInicial;
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