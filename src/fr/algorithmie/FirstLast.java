package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] tableau = {3, 1, 4, 6, 2, 5, 3};
        boolean resultat = tableau.length >= 1 && tableau[0] == tableau[tableau.length - 1];
        System.out.println(resultat);
    }
}
