package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static long calculerFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long fibN_1 = 1;
        long fibN_2 = 0;
        long fibN = 0;

        for (int i = 2; i <= n; i++) {
            fibN = fibN_1 + fibN_2;
            fibN_2 = fibN_1;
            fibN_1 = fibN;
        }

        return fibN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le rang N pour calculer la suite de Fibonacci : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Le rang doit être un nombre positif ou nul.");
        } else {
            long resultat = calculerFibonacci(n);
            System.out.println("Le nombre de rang N dans la suite de Fibonacci est : " + resultat);
        }

        scanner.close();
    }
}

