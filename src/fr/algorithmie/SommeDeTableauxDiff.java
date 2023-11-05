package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
        int size=array1.length;
        int[] result = new int[size];

        // Créer un tableau qui contient la somme des 2 précédents tableaux
        System.arraycopy(array1, 0, result, 0, array1.length);
        for(int j=0;j<array2.length;j++){
            result[j] += array2[j];
        }
        System.out.println("somme des 2 tableaux differents");
        for (int j : result) {
            System.out.println(j);
        }


    }

}
