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
public class Exer32 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        double hotDog = 1.20;
        double bauruSimples = 1.30;
        double bauruOvo = 1.50;
        double hamburguer = 1.20;
        double cheese = 1.30;
        double refri = 1.00;
        double total = 0;
        boolean stop = false;
        int codigo, qtd;
        String continuar;

        while (!stop) {
            System.out.println("informe o codigo do pedido: ");
            codigo = scanner.nextInt();
            System.out.println("informe a quantidade: ");
            qtd = scanner.nextInt();

            switch (codigo) {
                case 100:
                    System.out.println("preço a ser pago R$: " + hotDog * qtd);
                    total += hotDog * qtd;
                    break;
                case 101:
                    System.out.println("preço a ser pago R$: " + (bauruSimples * qtd));
                    total += bauruSimples * qtd;
                    break;
                case 102:
                    System.out.println("preço da ser pago R$: " + (bauruOvo * qtd));
                    total += bauruOvo * qtd;
                    break;
                case 103:
                    System.out.println("preço a ser pago R$ " + (hamburguer * qtd));
                    total = +hamburguer * qtd;
                    break;
                case 104:
                    System.out.println("preço a ser pago R$: " + (cheese * qtd));
                    total += cheese * qtd;
                    break;
                case 105:
                    System.out.println("preço a ser pago R$: " + (refri * qtd));
                    total += refri * qtd;
                    break;
                default:
                    System.out.println("codigo inválido");
            }

            System.out.println("deseja continuar (S/N): ");
            continuar = scanner.next();

            if (continuar.equalsIgnoreCase("n")) {
                stop = true;
            }
        }

        System.out.println("valor total a ser pago: " + total);

    }

}
