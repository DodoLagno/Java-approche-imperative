package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] tableau = {3, 1, 4, 6, 2, 5, 7};
        boolean resultat = (tableau.length > 0) && (tableau[0] == 6 || tableau[tableau.length - 1] == 6);
        System.out.println(resultat);
    }
}
