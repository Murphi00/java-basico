package Exception.labs;

import java.util.Scanner;


/**
 *
 * @author alan
 */
public class Exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcion = 1;
        Agenda agenda = new Agenda();

        while (opcion != 3) {
            opcion = opcaoMenu(scan);
            switch (opcion) {
                case 1:
                    consultarContato(scan, agenda);
                    break;
                case 2:
                    adicionarContato(scan, agenda);
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        String input;
        Contato contato = new Contato();

        System.out.println("informe o nome do contato: ");
        input = scan.nextLine();
        contato.setNome(input);

        System.out.println("informe o nome telefone: ");
        input = scan.nextLine();
        contato.setTelefone(input);

        System.out.println("informe o nome o email: ");
        input = scan.nextLine();
        contato.setEmail(input);

        try {
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException ex) {
            System.out.println(ex.getMessage());
            //System.out.println("Contatos da agenda: ");
            //System.out.println(agenda);
        }
    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = entradaNome(scan);

        try {
            int pos = agenda.consultarContato(nomeContato);
            if (pos >= 0) {
                System.out.println("Contato encontrado");
                System.out.println(agenda.getContatos()[pos].toString());
            }
        } catch (ContatoInexistenteException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String entradaNome(Scanner scan) {
        System.out.println("Informe o nome do contato: ");
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int opcaoMenu(Scanner scan) {
        boolean entradaValida = false;
        int opcion = 3;

        while (!entradaValida) {
            System.out.println("informe a opção desejada");
            System.out.println("1 - para consultar contato na agenda.");
            System.out.println("2 - para adicionar contato a agenda.");
            System.out.println("3 - para sair.");

            try {
                String entrada = scan.nextLine();
                opcion = Integer.parseInt(entrada);

                if (opcion == 1 || opcion == 2 || opcion == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada Inválida");
                }
            } catch (Exception ex) {
                System.out.println("Entrada Inválida!");
            }
        }
        return opcion;
    }
}
