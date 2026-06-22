package fr.fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        // DECLARATION ET MODIFICATION
        String [] villes = {"Marseille", "Manchester", "Milan", "Dortmund", "Valence"};


        for (String ville : villes) {
            System.out.println(ville);
        }
        System.out.println(villes.length);
        villes[3] = "Reims";

        System.out.println(villes.length);
    }
}
