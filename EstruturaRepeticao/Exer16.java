/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer16 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        while (proximo <= 500) {

            proximo = primeiro + segundo;

            primeiro = segundo;
            segundo = proximo;

            System.out.print(proximo + " ");
        }
    }

}
