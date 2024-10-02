package com.STD22073;

public class Main {
    public static void main(String[] args) {
        Quartier ivandry = new Quartier(1, "Ivandry");
        Quartier analamahitsy = new Quartier(2, "Analamahitsy");
        Quartier ambodifotaka = new Quartier(3, "Ambodifotaka");
        Quartier ampitatafika = new Quartier(4, "Ampitatafika");

        Immeuble jade = new Immeuble(1, "Jade", 5);
        Immeuble rubis = new Immeuble(2, "Rubis", 3);
        ivandry.ajouterImmeuble(jade);
        ampitatafika.ajouterImmeuble(rubis);

        Appartement appt1 = new Appartement(1, "Bel appartement à Ivandry", "Appartement spacieux avec vue", 680000, StatutAppartement.LIBRE, jade);
        Appartement appt2 = new Appartement(2, "Studio à Analamahitsy", "Petit studio confortable", 160000, StatutAppartement.LIBRE, analamahitsy);
        Appartement appt3 = new Appartement(3, "Duplex à Ivandry", "Grand duplex avec terrasse", 350000, StatutAppartement.OCCUPE, ivandry);
        Appartement appt4 = new Appartement(4, "Appartement à Ambodifotaka", "Appartement confortable avec vue", 50000, StatutAppartement.OCCUPE, ambodifotaka);
        Appartement appt5 = new Appartement(5, "Appartement à Ampitatafika", "Appartement confortable avec vue", 400000, StatutAppartement.OCCUPE, ampitatafika);
        Appartement appt6 = new Appartement(6, "Appartement fictif", "Luxurieux tout en un inclus", 1000000, StatutAppartement.LIBRE, rubis);

        Appartement[] appartements = {appt1, appt2, appt3, appt4, appt5, appt6};

        for (Appartement appt : appartements) {
            System.out.println("Appartement " + appt.getId() + ":");
            System.out.println("  Titre: " + appt.getTitre());
            System.out.println("  Description: " + appt.getDescription());
            System.out.println("  Loyer mensuel: " + appt.getLoyerMensuel() + " Ar");
            System.out.println("  Statut: " + appt.getStatut());
            System.out.println("  Dans Ivandry ? " + ivandry.contientAppartement(appt));
            System.out.println();
        }

        System.out.println("Nombre d'appartements dans l'immeuble Jade : " + jade.compterAppartements());
        System.out.println("Nombre d'appartements dans l'immeuble rubis : " + rubis.compterAppartements());
        System.out.println("Nombre d'appartements dans le quartier Ivandry : " + ivandry.compterAppartements());
        System.out.println("Nombre d'appartements dans le quartier Analamahitsy : " + analamahitsy.compterAppartements());
        System.out.println("Nombre d'appartements dans le quartier Ambodifotaka : " + ambodifotaka.compterAppartements());
        System.out.println("Nombre d'appartements dans le quartier Ampitatafika : " + ampitatafika.compterAppartements());
    }
}