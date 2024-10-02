package com.STD22073;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Endroit {
    protected int id;
    protected String nom;
    protected List<Appartement> appartements = new ArrayList<>();

    public Endroit(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public void ajouterAppartement(Appartement appartement) {
        appartements.add(appartement);
    }

    public abstract int compterAppartements();
}
