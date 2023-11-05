package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[10]; // Tableau initial avec une taille de 10
        int taille = 0; // Taille actuelle du tableau

        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    if (taille >= tableau.length) {
                        // Si le tableau est plein, agrandissons-le
                        int[] nouveauTableau = new int[tableau.length * 2];
                        System.arraycopy(tableau, 0, nouveauTableau, 0, tableau.length);
                        tableau = nouveauTableau;
                    }

                    System.out.print("Entrez un nombre : ");
                    int nombre = scanner.nextInt();
                    tableau[taille] = nombre;
                    taille++;
                    break;
                case 2:
                    System.out.println("Nombres existants :");
                    for (int i = 0; i < taille; i++) {
                        System.out.println(tableau[i]);
                    }
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
            }
        }
    }
}
