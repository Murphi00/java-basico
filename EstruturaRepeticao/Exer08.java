package EstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer08 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int num;
        int soma = 0;
        int cont = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("informe numero no index: " + i);
            num = scanner.nextInt();

            soma += num;
            cont++;
        }

        System.out.println("soma dos numeros informados: " + soma);
        System.out.println("media dos numeros informados: " + (soma / cont));
    }

}
