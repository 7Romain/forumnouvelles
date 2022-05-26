package fr.oz;

import javax.swing.JOptionPane;

public class Abonne {
    String prenom;
    String nom;
    int age;
    IAbonneForum forum;

    public Abonne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    void ajouterNouvelle() {
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

    }

    void consulterNouvelle(int i) {
        forum.consulterNouvelle(i);
    }

    void repondreNouvelle(int i) {
        forum.repondreNouvelle(i);
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public IAbonneForum getForum() {
        return forum;
    }

    public void setForum(IAbonneForum forum) {
        this.forum = forum;
    }

}
