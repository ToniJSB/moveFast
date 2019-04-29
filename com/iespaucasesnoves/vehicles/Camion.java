package com.iespaucasesnoves.vehicles;

public class Camion extends Vehicle {
    private double tara;
    private double mma;

    public Camion(String matricula, double precioHora, double peso, String tipoCarnet, TipoCoche tipoCoche, int numPasajeros, int numPuertas, int numRuedas, boolean estaDisponible, double tara, double mma) {
        super(matricula, precioHora, peso, tipoCarnet, tipoCoche, numPasajeros, numPuertas, numRuedas, estaDisponible);
        this.tara = tara;
        this.mma = mma;
    }

    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public double getMma() {
        return mma;
    }

    public void setMma(double mma) {
        this.mma = mma;
    }
}
