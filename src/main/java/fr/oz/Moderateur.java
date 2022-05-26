package fr.oz;

public class Moderateur {
    String prenom;
    String nom;
    int age;
    IModerateurForum forum;

    public Moderateur(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    void supprimerNouvelle(Nouvelle a) {
        Nouvelle Nouvelle;
        forum.supprimerNouvelle(Nouvelle);

    };

    void bannirAbonne(Abonne a) {
        Abonne Abonne;
        forum.bannirAbonne(Abonne a);

    };

    void ajouterAbonne(Abonne a) {
        Abonne Abonne;
        forum.ajouterAbonne(Abonne a);

    };

    void listerAbonne() {
        forum.listerAbonne();
    };

    void listerNouvelle() {
        forum.listerAbonne();
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

    public void setForum(IModerateurForum forum) {
        this.forum = forum;
    };

}
