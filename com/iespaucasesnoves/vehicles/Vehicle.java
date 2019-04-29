package com.iespaucasesnoves.vehicles;

public class Vehicle {
    private String matricula;
    private double precioHora;
    private double peso;
    private String tipoCarnet;
    private TipoCoche tipoCoche;
    private int numPuertas;
    private int numRuedas;
    private boolean estaDisponible;

    public Vehicle(String matricula, double precioHora, double peso, String tipoCarnet, TipoCoche tipoCoche, int numPasajeros, int numPuertas, int numRuedas, boolean estaDisponible) {
        this.matricula = matricula;
        this.precioHora = precioHora;
        this.peso = peso;
        this.tipoCarnet = tipoCarnet;
        this.tipoCoche = tipoCoche;
        this.numPuertas = numPuertas;
        this.numRuedas = numRuedas;
        this.estaDisponible = estaDisponible;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String getTipoCarnet() {
        return tipoCarnet;
    }

    public void setTipoCarnet(String tipoCarnet) {
        this.tipoCarnet = tipoCarnet;
    }

    public TipoCoche getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(TipoCoche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }


}
