package fr.operateurs.I.E;

public class ClasseExecutable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean testEt = a > 0 && b < 10;
        boolean testOu = a > 0 || b < 10;
        a = a + 1;
        a++;
        a += 1;
        String c = a > 0 ? "a est plus grand que 0" : "a est inferieur à 0";

        System.out.println(a);
        System.out.println(b);
        System.out.println(testEt);
        System.out.println(testOu);
        System.out.println(c);
    }
}
