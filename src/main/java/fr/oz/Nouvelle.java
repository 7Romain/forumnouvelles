package fr.oz;

import java.util.Date;

public class Nouvelle {
    String sujet;
    String texte;
    Date dateCreation;

    public Nouvelle(String sujet, String texte) {
        this.sujet = sujet;
        this.texte = texte;
        dateCreation = new Date();
    }

}
