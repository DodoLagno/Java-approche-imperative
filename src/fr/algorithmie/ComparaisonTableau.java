package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        int count = compterElementsCommuns(array1, array2);
        System.out.println("Le nombre d'éléments en commun est : " + count);
    }

    public static int compterElementsCommuns(int[] array1, int[] array2) {
        int count = 0;

        for (int element1 : array1) {
            for (int element2 : array2) {
                if (element1 == element2) {
                    count++;
                    break; // Sort de la boucle interne dès qu'un élément commun est trouvé
                }
            }
        }

        return count;
    }
}
