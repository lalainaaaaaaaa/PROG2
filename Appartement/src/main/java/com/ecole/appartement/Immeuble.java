package com.ecole.appartement;

public class Immeuble extends Endroit {
    private static String description;
    private int nombreEtages;

    public Immeuble(String immeuble, String quartier, String identifiant, String nom, String titre, int loyerMensuel) {;
        this.nombreEtages = nombreEtages;
    }

    public int getNombreEtages() {
        return nombreEtages;
    }

    public void setNombreEtages(int nombreEtages) {
        this.nombreEtages = nombreEtages;
    }
}
