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
public class Exer04e05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        int habitantesA, habitantesB = 0;
        double taxaA, taxaB = 0;

        do {
            System.out.println("informe a quantidade de habitantes do pais A: ");
            habitantesA = scanner.nextInt();

            if (habitantesA <= 0) {
                System.out.println("informe uma quantitade válida");
                valido = false;
            } else {
                valido = true;
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("informe a taxa anual de crescimento pais A: ");
            taxaA = scanner.nextDouble();

            if (taxaA <= 0) {
                System.out.println("informe uma taxa válida");
                valido = false;
            } else {
                valido = true;
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("informe a quantidade de habitantes do pais B: ");
            habitantesB = scanner.nextInt();

            if (habitantesB <= 0) {
                System.out.println("informe uma quantitade válida");
                valido = false;
            } else {
                valido = true;
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("informe a taxa anual de crescimento pais B: ");
            taxaB = scanner.nextDouble();

            if (taxaB <= 0) {
                System.out.println("informe uma taxa válida");
                valido = false;
            } else {
                valido = true;
            }
        } while (!valido);

        int cont = 0;
        while (habitantesA < habitantesB) {
            habitantesA += (habitantesA / 100) * taxaA;
            habitantesB += (habitantesB / 100) * taxaB;
            cont++;
        }

        System.out.println("população A: " + habitantesA);
        System.out.println("população B: " + habitantesB);
        System.out.println("quantidade de anos: " + cont);
    }

}
