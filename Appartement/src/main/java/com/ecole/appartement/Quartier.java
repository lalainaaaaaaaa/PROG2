package com.ecole.appartement;


public class Quartier extends Endroit {
    private String ensembleImmeuble;

    public Quartier(String ensembleImmeuble) {
        this.ensembleImmeuble = ensembleImmeuble;
    }

    public String getEnsembleImmeuble() {
        return ensembleImmeuble;
    }

    public void setEnsembleImmeuble(String ensembleImmeuble) {
        this.ensembleImmeuble = ensembleImmeuble;
    }

    public boolean belongToAppartement(Appartement appartement){
        double exists = 0;
        if(exists!=0){
            return true;
        }
        return false;
    }

}

