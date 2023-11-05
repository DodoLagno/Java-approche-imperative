package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        System.out.print("Veuillez saisir un nombre : ");
        nombre = scanner.nextInt();

        int somme = 0;

        for (int i = 1; i <= nombre; i++) {
            somme += i;
        }

        System.out.println("La somme des entiers de 1 à " + nombre + " est : " + somme);
    }
}

