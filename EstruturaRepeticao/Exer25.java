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
public class Exer25 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int cont = 1;
        double valor, total = 0, dinheiro, troco = 0;
        boolean continuar = true, pagamento = false;

        System.out.println("Lojas Tajabaras");
        System.out.println("informe o valor 0 para finalizar a compra");
        while (continuar) {
            System.out.println("Produto: " + cont);
            valor = scanner.nextDouble();

            if (valor == 0) {
                continuar = false;
            }

            total += valor;
            cont++;

            if (!continuar) {
                System.out.println("Total: " + total);
                System.out.print("Dinheiro: ");
                dinheiro = scanner.nextDouble();

                do {
                    if (dinheiro < total) {
                        System.out.println("valor para pagamento invalido");
                        System.out.print("Dinheiro: ");
                        dinheiro = scanner.nextDouble();
                    } else {
                        pagamento = true;
                    }

                } while (!pagamento);

                System.out.println("Troco: " + (dinheiro - total));
                System.out.println("----- COMPRA FINALIZADA -----");
                System.out.println();
                total = 0;
                cont = 1;
                continuar = true;
                pagamento = false;
            }

        }
    }

}
