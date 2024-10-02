package com.STD22073;

public class Immeuble extends Endroit {
    private int nombreEtages;

    public Immeuble(int id, String nom, int nombreEtages) {
        super(id, nom);
        this.nombreEtages = nombreEtages;
    }

    public int getNombreEtages() {
        return nombreEtages;
    }

    @Override
    public int compterAppartements() {
        return appartements.size();
    }
}

