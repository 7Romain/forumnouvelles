package fr.oz;

import java.util.ArrayList;
import java.util.Date;

public class Forum implements IAbonneForum, IModerateurForum {
    Date dateCreation;
    String nom;
    ArrayList listeNouvelles = new ArrayList();
    ArrayList listAbonnes = new ArrayList();

    public Forum() {
    }

    public Forum(String nom) {
        this.nom = nom;
        Date dateCreation = new Date();
        ArrayList nouvelles = new ArrayList();
        ArrayList abonnes = new ArrayList();

    }

    public boolean ajouterNouvelle(Nouvelle n) {
        return true;
    }

    public void consulterNouvelle(int i) {
    }

    public void repondreNouvelle(int i) {
    }

    public boolean supprimerNouvelle(Nouvelle n) {
        return true;
    }

    public void bannirAbonne(Abonne a) {
    }

    public void ajouterAbonne(Abonne a) {
    }

    public int listerAbonne() {
        return 1;
    }

    public void listerNouvelle() {
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
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

    public void setListeNouvelles(ArrayList listeNouvelles) {
        this.listeNouvelles = listeNouvelles;
    }

    public ArrayList getListAbonnes() {
        return listAbonnes;
    }

    public void setListAbonnes(ArrayList listAbonnes) {
        this.listAbonnes = listAbonnes;
    }

<<<<<<< HEAD
    @Override
    public void ajouterNouvelle() {
        // TODO Auto-generated method stub

    }

=======
>>>>>>> 19d65a3305474d7bc1359a66c41f17b39a69629e
}
