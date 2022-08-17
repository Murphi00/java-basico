/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysVetores;

import java.util.Random;

/**
 *
 * @author alan
 */
public class Exer33 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Random random = new Random();

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(20) + 1;

            boolean primo = true;
            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            String msg = "";
           
            if (primo) {
                msg = "primo";
            } else {
                msg = "não primo";
            }

            System.out.println(vetorA[i] + " resultado: " + msg);
        }
    }

}
