package ArraysVetores;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer30 {

    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        int indexB = 0, indexC = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite o numero na posição " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] % 2 == 0) {
                vetorB[indexB] = vetorA[i];
                indexB++;
            } else {
                vetorC[indexC] = vetorA[i];
                indexC++;
            }
        }

        System.out.println("vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nvetor B - numeros pares");
        for (int i = 0; i < indexB; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nvetor C - numeros impares");
        for (int i = 0; i < indexC; i++) {
            System.out.print(vetorC[i] + " ");
        }

        System.out.println();
    }

}
