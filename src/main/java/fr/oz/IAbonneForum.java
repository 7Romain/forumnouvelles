package fr.oz;

public interface IAbonneForum {

    Nouvelle ajouterNouvelle();

    void consulterNouvelle(int i);

    void repondreNouvelle(Nouvelle nouvelle);

    boolean deposerNouvelle(Nouvelle n);

}
