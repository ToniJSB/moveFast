package com.iespaucasesnoves.vehicles;

public class Motocicleta extends Vehicle {
    private int cilindradas;

    public Motocicleta(String matricula, double precioHora, double peso, String tipoCarnet, TipoCoche tipoCoche, int numPasajeros, int numPuertas, int numRuedas, boolean estaDisponible, int cilindradas) {
        super(matricula, precioHora, peso, tipoCarnet, tipoCoche, numPasajeros, numPuertas, numRuedas, estaDisponible);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
