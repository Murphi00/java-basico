package Matrizes;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer05 {

    public static void main(String[] alan) {
        Scanner scanner = new Scanner(System.in);

        String[][][] commitment = new String[12][31][24];

        boolean close = false;
        boolean validDay;
        byte option;
        int day = 0;
        int hour = 0;
        int month = 0;

        while (!close) {
            System.out.println("\ndigite 1 para adicionar compromisso");
            System.out.println("digite 2 para verificar compromisso");
            System.out.println("digite 0 para sair");
            option = scanner.nextByte();

            switch (option) {
                case 1:
                    boolean validMonth = false;
                    while (!validMonth) {
                        System.out.println("informe o mês: ");
                        month = scanner.nextInt();

                        if (month > 0 && month <= 12) {
                            validMonth = true;
                        } else {
                            System.out.println("mês inválido. Tente novamente");
                        }
                    }

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
                        if (hour >= 0 && hour <= 8) {
                            validTime = true;
                        } else {
                            System.out.println("hora invalida. Tente novamente");
                        }
                    }

                    System.out.println("\ninforme o compromisso: ");
                    commitment[--month][--day][hour] = scanner.next();
                    System.out.println("compromisso adicionado com sucesso");
                    break;

                case 2:
                    validMonth = false;
                    while (!validMonth) {
                        System.out.println("informe o mês: ");
                        month = scanner.nextInt();

                        if (month > 0 && month <= 12) {
                            validMonth = true;
                        } else {
                            System.out.println("mês inválido. Tente novamente");
                        }
                    }

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
                        if (hour >= 0 && hour <= 8) {
                            validTime = true;
                        } else {
                            System.out.println("hora invalida. Tente novamente");
                        }
                    }

                    System.out.println("\ncompromisso mês " + month + " dia " + day + " às "
                            + hour + "h: " + commitment[--month][--day][hour]);
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
