package fr.oz;

public class Moderateur {
    String prenom;
    String nom;
    int age;
    static IModerateurForum forum;

    public Moderateur(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        IModerateurForum forum;
    }

    void supprimerNouvelle(Nouvelle a) {
        forum.supprimerNouvelle(a);

    }

    void bannirAbonne(Abonne a) {
        forum.bannirAbonne(a);

    }

    void avertir(Abonne a) {
        int n = a.getAvertissement() + 1;
        a.setAvertissement(n);
        if (a.getAvertissement() > 3) {
            forum.bannirAbonne(a);
        }
    }

    void ajouterAbonne(Abonne a) {
        forum.ajouterAbonne(a);

    }

    void listerAbonne() {
        forum.listerAbonne();
    }

    void listerNouvelle() {
        forum.listerNouvelle();
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

    public IModerateurForum getForum() {
        return forum;
    }

    public static void setForum(IModerateurForum fofo) {
        forum = fofo;
    }

}
