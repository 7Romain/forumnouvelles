package fr.oz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Forum implements IAbonneForum, IModerateurForum {
    // Date dateCreation;
    LocalDateTime dateCreation;
    String nom;
    ArrayList<Nouvelle> listeNouvelles;
    ArrayList<Abonne> listeAbonnes;

    public Forum() {
    }

    public Forum(String nom) {

        this.nom = nom;
        dateCreation = LocalDateTime.now();
        listeNouvelles = new ArrayList();
        listeAbonnes = new ArrayList();

    }

    public boolean deposerNouvelle(Nouvelle n) {
        if (listeNouvelles.add(n)) {
            return true;
        }
        return false;
        // listeNouvelles.add(n)? return true : return false;

    }

    public boolean supprimerNouvelle(Nouvelle n) {
        if (listeNouvelles.remove(n)) {
            return true;
        }
        return false;

    }

    public void consulterNouvelle(int i) {
        listeNouvelles.get(i);
    }

    public void repondreNouvelle(Nouvelle nouvelleAContinuer) {
        String txt;

        deposerNouvelle(new Nouvelle(nouvelleAContinuer.getSujet(),
                txt = JOptionPane.showInputDialog(null,
                        "Texte ?",
                        "Nouvelle",
                        JOptionPane.QUESTION_MESSAGE)));

    }

    public void bannirAbonne(Abonne a) {
        listeAbonnes.remove(a);
    }

    public void ajouterAbonne(Abonne a) {
        listeAbonnes.add(a);
    }

    public void listerAbonne() {
        String totale = "Les abonnés sont : \n\n";

        Iterator<Abonne> chaque = listeAbonnes.iterator();

        while (chaque.hasNext()) {

            String tour = String.format("%s%n", chaque.next().toString(1));

            totale += tour;
        }
        JOptionPane.showMessageDialog(null, totale);

    }

    public void listerNouvelle() {
        String totale = "Les nouvelles sont : \n\n";
        for (Nouvelle chaque : listeNouvelles) {
            String tour = chaque.toString() + "\n";
            totale += tour;

        }
        JOptionPane.showMessageDialog(null, totale);
    }

    public Nouvelle ajouterNouvelle() {
        String sujet = JOptionPane.showInputDialog(
                null,
                "Entrez le sujet de votre Nouvelle.",
                "Ajouter une Nouvelle.",
                JOptionPane.QUESTION_MESSAGE);

        String texte = JOptionPane.showInputDialog(
                null,
                "Entrez le texte de votre Nouvelle.",
                "Ajouter une Nouvelle.",
                JOptionPane.QUESTION_MESSAGE);

        Nouvelle nouvelle = new Nouvelle(sujet, texte);
        deposerNouvelle(nouvelle);
        return nouvelle;

    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList getListeNouvelles() {
        return listeNouvelles;
    }

    public void setListeNouvelles(ArrayList<Nouvelle> listeNouvelles) {
        this.listeNouvelles = listeNouvelles;
    }

    public ArrayList getListAbonnes() {
        return listeAbonnes;
    }

    public void setListAbonnes(ArrayList<Abonne> listAbonnes) {
        this.listeAbonnes = listAbonnes;
    }

}
