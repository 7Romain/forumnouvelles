package fr.oz;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        String reponse = JOptionPane.showInputDialog(
                null,
                "Nom du Forum ?",
                "Forum",
                JOptionPane.QUESTION_MESSAGE);
        Forum fofo = new Forum(reponse);
        System.out.println(fofo.dateCreation);
        Abonne.setForum(fofo);
        Moderateur.setForum(fofo);
        Abonne marc = new Abonne("marc", "machin", 18);
        Abonne marie = new Abonne("marie", "tamanie", 19);
        Abonne thomas = new Abonne("thomas", "perrier", 10);
        Abonne josiane = new Abonne("josiane", "mercier", 13);
        Moderateur louis = new Moderateur("marc", "machin", 21);
        Moderateur philippe = new Moderateur("philippe", "lui", 25);
        louis.ajouterAbonne(marc);
        louis.ajouterAbonne(thomas);
        louis.ajouterAbonne(josiane);
        louis.ajouterAbonne(marie);
        marc.ajouterNouvelle();
        thomas.ajouterNouvelle();
        josiane.ajouterNouvelle();
        philippe.listerAbonne();
        philippe.listerNouvelle();
        JOptionPane.showMessageDialog(null, String.format("%s %s", fofo.getNom(), fofo.getDateCreation()));
        louis.avertir(marie);
        louis.avertir(marie);
        louis.avertir(marie);
        philippe.listerAbonne();
        louis.avertir(marie);
        philippe.listerAbonne();
    }
}
