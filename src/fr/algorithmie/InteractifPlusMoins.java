package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Random random = new Random();
        int nombreSecret = random.nextInt(100) + 1; // Génère un nombre aléatoire entre 1 et 100
        int nombreEssais = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu du Plus ou Moins !");
        System.out.println("Essayez de deviner le nombre entre 1 et 100.");

        while (true) {
            System.out.print("Entrez votre proposition : ");
            int proposition = scanner.nextInt();
            nombreEssais++;

            if (proposition < nombreSecret) {
                System.out.println("Le nombre est plus grand.");
            } else if (proposition > nombreSecret) {
                System.out.println("Le nombre est plus petit.");
            } else {
                System.out.println("Bravo, vous avez trouvé en " + nombreEssais + " coups !");
                break;
            }
        }

        scanner.close();
    }
}
