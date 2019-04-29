package com.iespaucasesnoves.vehicles;

public class Coche extends Vehicle{
    private int numPasajeros;

    public Coche(String matricula, double precioHora, double peso, String tipoCarnet, TipoCoche tipoCoche, int numPasajeros, int numPuertas, int numRuedas, boolean estaDisponible) {
        super(matricula, precioHora, peso, tipoCarnet, tipoCoche, numPasajeros, numPuertas, numRuedas, estaDisponible);
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
}
