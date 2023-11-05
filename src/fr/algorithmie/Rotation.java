package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] tableau = {0, 1, 2, 3};
        rotationADroite(tableau);
        afficherTableau(tableau);
    }

    public static void rotationADroite(int[] tableau) {
        if (tableau.length <= 1) {
            return; // Rien à faire si le tableau a 0 ou 1 élément
        }

        int dernierElement = tableau[tableau.length - 1];

        for (int i = tableau.length - 1; i > 0; i--) {
            tableau[i] = tableau[i - 1];
        }

        tableau[0] = dernierElement;
    }

    public static void afficherTableau(int[] tableau) {
        for (int element : tableau) {
            System.out.print(element + " ");
        }
    }
}

