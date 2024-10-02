package com.STD22073;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Quartier extends Endroit {
    private List<Immeuble> immeubles = new ArrayList<>();

    public Quartier(int id, String nom) {
        super(id, nom);
    }

    public void ajouterImmeuble(Immeuble immeuble) {
        immeubles.add(immeuble);
    }

    public boolean contientAppartement(Appartement appartement) {
        if (appartements.contains(appartement)) {
            return true;
        }
        for (Immeuble immeuble : immeubles) {
            if (immeuble.appartements.contains(appartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compterAppartements() {
        int total = appartements.size();
        for (Immeuble immeuble : immeubles) {
            total += immeuble.compterAppartements();
        }
        return total;
    }
}
