package fr.declaration.variable;

public class DeclarationApp {

    // !!! On ne peut seulement déclarer des varaible en dehors de la méthode !!! mais pas le system.out.println()
    public static void main(String[] args) {
        byte a = -1;
        short b = 15000;
        int c = 1000000;
        long d = 20000L;
        float e = 99.99F;
        double f = 2.5D;
        char g = 'g';
        boolean h = true;
        String i = "Hello";
        String randomString = "Voici le résultat d’un calcul : " +
                "1+5=6";

        System.out.println(randomString);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }
}

