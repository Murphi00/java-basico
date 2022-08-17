/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer31 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int anoEntrada, anoAtual, cont = 0;
        double salario, porcentagem, salarioAtual = 0;

        DecimalFormat format = new DecimalFormat("###,###,###");

        System.out.println("informe o ano que entrou na empresa: ");
        anoEntrada = scanner.nextInt();
        System.out.println("informe o ano atual: ");
        anoAtual = scanner.nextInt();
        System.out.println("informe o valor do sálario: ");
        salario = scanner.nextDouble();
        System.out.println("informe a porcentagem de aumento por ano: ");
        porcentagem = scanner.nextDouble();

        for (int i = anoEntrada; i <= anoAtual; i++) {
            porcentagem *= 2;

            salarioAtual = salario + ((salario * porcentagem) / 100);

            System.out.println("salario ano de: " + i + " R$: " + format.format(salarioAtual));
        }

    }

}
