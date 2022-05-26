package fr.oz;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String reponse = JOptionPane.showInputDialog(
                null,
                "Nom du Forum ?",
                "Forum",
                JOptionPane.QUESTION_MESSAGE);
        Forum forum = new Forum(reponse);
        Abonne marc = new Abonne("marc", "machin", 18);
        marc.setForum(forum);
        System.out.println(marc.getForum());

    }
}
