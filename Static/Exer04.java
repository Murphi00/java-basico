package Static;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer04 {

    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);
        int meters, option;
        double unity = 0;

        do {
            System.out.println("informe a quantidade de metros: ");
            meters = scanner.nextInt();

            if (meters < 0) {
                System.out.println("numero invalido");
            }

        } while (meters < 0); //roda ate a condição for verdadeira

        do {
            System.out.println("informe a unidade: "
                    + "1 -  metroquadrado = 10.76 pés quadrados\n"
                    + "2 - pé quadrado = 929 centímetros quadrados\n"
                    + "3 - milha quadrada = 640 acres \n"
                    + "4 - acre = 43.560 pés quadrados");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    unity = 10.76;
                    break;
                case 2:
                    unity = 929;
                    break;
                case 3:
                    unity = 640;
                    break;
                case 4:
                    unity = 43.560;
            }

            if (unity < 0) {
                System.out.println("numero invalido");
            }

        } while (unity < 0);
        ConversaoUnidadeArea.imprimir(ConversaoUnidadeArea.conversao(meters, unity));
    }

}
