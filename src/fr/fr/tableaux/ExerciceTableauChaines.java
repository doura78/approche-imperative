package fr.fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        // DECLARATION ET MODIFICATION
        String [] villes = {"Marseille", "Manchester", "Milan", "Dortmund", "Valence"};


        System.out.println(villes[0]);
        System.out.println(villes[1]);
        System.out.println(villes[2]);
        System.out.println(villes[3]);
        System.out.println(villes[4]);

        System.out.println(villes.length);

        villes[3] = "Reims";

        System.out.println(villes[0]);
        System.out.println(villes[1]);
        System.out.println(villes[2]);
        System.out.println(villes[3]);
        System.out.println(villes[4]);
    }
}
