package fr.creation_classe;

import org.w3c.dom.ls.LSOutput;

public class TestAdresse {
    public static void main(String[] args) {
        Adresse a1 = new Adresse();
        a1.codePostale = "78190";
        a1.numeroVoie = 1;
        a1.rue = "George Sand";
        a1.ville = "Trappes";

        System.out.println(a1.codePostale);
    }

}
