package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int batons = 21;
        boolean tourJoueur = true;

        System.out.println("Bienvenue dans le jeu des 21 bâtons !");
        System.out.println("Vous allez jouer contre l'ordinateur.");

        while (batons > 0) {
            System.out.println("Il reste " + batons + " bâtons.");
            int maxPrise = Math.min(4, batons);

            if (tourJoueur) {
                System.out.print("Combien de bâtons voulez-vous prendre (1-" + maxPrise + ") ? ");
                int prise = scanner.nextInt();
                if (prise < 1 || prise > maxPrise) {
                    System.out.println("Choix invalide. Veuillez choisir un nombre entre 1 et " + maxPrise + ".");
                    continue;
                }
                batons -= prise;
            } else {
                int prise = random.nextInt(maxPrise) + 1;
                System.out.println("L'ordinateur prend " + prise + " bâton(s).");
                batons -= prise;
            }

            tourJoueur = !tourJoueur;
        }

        if (tourJoueur) {
            System.out.println("Félicitations, vous avez gagné !");
        } else {
            System.out.println("L'ordinateur a gagné. Essayez encore !");
        }

        scanner.close();
    }
}
