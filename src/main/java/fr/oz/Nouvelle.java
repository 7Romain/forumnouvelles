package fr.oz;

import java.util.Date;

public class Nouvelle {
    @Override
    public String toString() {
        return sujet + " --- " + texte;
    }

    public String getSujet() {
        return sujet;
    }

    public String getTexte() {
        return texte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    String sujet;
    String texte;
    Date dateCreation;

    public Nouvelle(String sujet, String texte) {
        this.sujet = sujet;
        this.texte = texte;
        dateCreation = new Date();
    }

}
