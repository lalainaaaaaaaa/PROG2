package com.ecole.appartement;

public class Appartement extends Endroit{
    private String identifiant;
    private String titre;
    private String description;
    private int loyerMensuel;
    private String status;

    public Appartement(String identifiant, String titre, String description, int loyerMensuel, String status) {
        super();
        this.identifiant = identifiant;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.status = status;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLoyerMensuel() {
        return loyerMensuel;
    }

    public void setLoyerMensuel(int loyerMensuel) {
        this.loyerMensuel = loyerMensuel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
