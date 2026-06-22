package fr.fr.tableaux;

public class ExerciceDaclarationTab {
    public static void main(String[] args) {
        //DECLARATION DE BASE
        int [] notes = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(notes[0]);
        System.out.println(notes.length);
        System.out.println(notes[7]);
        System.out.println(notes[8]); // accès hors des limites du tableau, donc on a une erreur à l'exécution

    }
}


