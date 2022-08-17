/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysVetores;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer24 {

    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite numero na posição " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        boolean palindromo = true;

        for (int i = 0; i < vetorA.length / 2; i++) {
            if (vetorA[i] != (vetorA.length - 1 - i)) {
                palindromo = false;
                break;
            }
        }

        if (palindromo == true) {
            System.out.println("palindromo");
        } else {
            System.out.println("não é palindromo");
        }
    }

}
