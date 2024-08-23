package Examen;

public class Chambre {
    private int numeroChambre;
    private double tarifNuitee;

    public Chambre(int numeroChambre, double tarifNuitee) {
        this.numeroChambre = numeroChambre;
        this.tarifNuitee = tarifNuitee;
    }

    public int getNumeroChambre() {
        return numeroChambre;
    }

    public double getTarifNuitee() {
        return tarifNuitee;
    }
}

