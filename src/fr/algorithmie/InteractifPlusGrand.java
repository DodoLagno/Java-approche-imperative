package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // Initialise max avec une valeur très basse

        for (int i = 1; i <= 10; i++) {
            System.out.print("Saisissez le nombre " + i + " : ");
            int nombre = scanner.nextInt();

            if (nombre > max) {
                max = nombre; // Met à jour le maximum si le nombre saisi est plus grand
            }
        }

        System.out.println("Le plus grand nombre parmi les 10 nombres est : " + max);
    }
}

