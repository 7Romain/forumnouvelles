package fr.oz;

public interface IModerateurForum {
    boolean supprimerNouvelle(Nouvelle n);

    void bannirAbonne(Abonne a);

    void ajouterAbonne(Abonne a);

    void listerAbonne();

    void listerNouvelle();
}
