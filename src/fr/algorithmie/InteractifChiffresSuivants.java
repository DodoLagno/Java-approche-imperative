package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        System.out.print("Veuillez saisir un nombre : ");
        nombre = scanner.nextInt();

        System.out.println("Les 10 chiffres suivants après " + nombre + " sont :");
        for (int i = nombre + 1; i <= nombre + 10; i++) {
            System.out.println(i);
        }
    }
}

