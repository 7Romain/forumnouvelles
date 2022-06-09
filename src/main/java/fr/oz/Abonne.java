package fr.oz;

import javax.swing.JOptionPane;

public class Abonne {
    String prenom;
    String nom;
    int age;
    static IAbonneForum forum;
    int avertissement;

    public int getAvertissement() {
        return this.avertissement;
    }

    public void setAvertissement(int avertissement) {
        this.avertissement = avertissement;
    }

    public Abonne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        IAbonneForum forum;
        avertissement = 0;
    }

    void ajouterNouvelle() {
        forum.ajouterNouvelle();

    }

    public void deposerNouvelle(Nouvelle n) {
        forum.deposerNouvelle(n);

    }

    void consulterNouvelle(int i) {
        forum.consulterNouvelle(i);
    }

    void repondreNouvelle(Nouvelle nouvelle) {
        forum.repondreNouvelle(nouvelle);
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

    public static void setForum(IAbonneForum fofo) {
        forum = fofo;
    }

    public void creerNouvelle() {
        String titreNouvelle = JOptionPane.showInputDialog(null, "Titre ?", "Nouvelle", JOptionPane.QUESTION_MESSAGE);
        String messageNouvelle = JOptionPane.showInputDialog(null, "Texte ?", "Nouvelle", JOptionPane.QUESTION_MESSAGE);
        String titrePropre = titreNouvelle.replaceAll(String.valueOf((char) 0160), " ").trim();
        String messsagePropre = messageNouvelle.replaceAll(String.valueOf((char) 0160), " ").trim();

        Nouvelle nouvelle = new Nouvelle(titrePropre, messsagePropre);

    }

    @Override
    public String toString() {
        return "Abonne [age=" + age + ", nom=" + nom + ", prenom=" + prenom + "]";
    }

    public String toString(int a) {
        return String.format("%s %s %s ans.", nom, prenom, age);
    }

}
