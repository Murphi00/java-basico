package Matrizes;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer04 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        String[][] commitment = new String[31][24];
        boolean close = false;
        boolean validDay = false;
        byte option;
        int day = 0;
        int hour = 0;

        while (!close) {
            System.out.println("\ndigite 1 para adicionar compromisso");
            System.out.println("digite 2 para verificar compromisso");
            System.out.println("digite 0 para sair");
            option = scanner.nextByte();

            switch (option) {
                case 1:
                    validDay = false;
                    while (!validDay) {
                        System.out.println("informe o dia: ");
                        day = scanner.nextInt();

                        if (day > 0 && day <= 31) {
                            validDay = true;
                        } else {
                            System.out.println("Dia inválido. Tente novamente.");
                        }
                    }

                    boolean validTime = false;
                    while (!validTime) {
                        System.out.println("informe a hora: ");
                        hour = scanner.nextInt();
                        if (hour >= 0 && hour <= 24) {
                            validTime = true;
                        } else {
                            System.out.println("hora invalida. Tente novamente");
                        }
                    }

                    System.out.println("\ninforme o compromisso: ");
                    commitment[--day][hour] = scanner.next();
                    System.out.println("compromisso adicionado com sucesso");
                    break;

                case 2:
                    validDay = false;
                    while (!validDay) {
                        System.out.println("informe o dia: ");
                        day = scanner.nextInt();

                        if (day > 0 && day <= 31) {
                            validDay = true;
                        } else {
                            System.out.println("Dia inválido. Tente novamente.");
                        }
                    }

                    validTime = false;
                    while (!validTime) {
                        System.out.println("informe a hora: ");
                        hour = scanner.nextInt();
                        if (hour >= 0 && hour <= 24) {
                            validTime = true;
                        } else {
                            System.out.println("hora invalida. Tente novamente");
                        }
                    }

                    System.out.println("\ncompromisso dia " + day + " às " + hour + "h: " + commitment[--day][hour]);
                    break;

                case 0:
                    close = true;
                    break;
                default:
                    System.out.println("opção inválida");
                    break;
            }
        }
    }

}
