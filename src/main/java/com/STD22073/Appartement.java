package com.STD22073;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Appartement {
    private int id;
    private String titre;
    private String description;
    private double loyerMensuel;
    private StatutAppartement statut;
    private Endroit endroit;

    public Appartement(int id, String titre, String description, double loyerMensuel, StatutAppartement statut, Endroit endroit) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.statut = statut;
        this.endroit = endroit;
        endroit.ajouterAppartement(this);
    }
}