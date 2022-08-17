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
public class Exer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean valido = false;

        do {
            System.out.println("digite um nome:");
            String nome = scanner.next();

            if (nome.length() > 3) {
                System.out.println("validado com sucesso");
                valido = true;
            } else {
                System.out.println("invalido, digite novamente.");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("informe a idade: ");
            int idade = scanner.nextInt();

            if (idade >= 0 && idade <= 150) {
                System.out.println("validado com sucesso");
                valido = true;
            } else {
                System.out.println("invalido, digite uma idade entre 0 e 150");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("informe o salário: ");
            double salario = scanner.nextDouble();

            if (salario > 0) {
                System.out.println("validado com sucesso");
                valido = true;
            } else {
                System.out.println("digite um salario maior que 0");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("informe o sexo: 'M', 'f' ou 'O': ");
            String sexo = scanner.next();

            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("o")) {
                System.out.println("validado com sucesso");
                valido = true;
            } else {
                System.out.println("informe uma das opções");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("informe o estado civil: 's', 'c', 'd' ou 'v': ");
            String estadoCivil = scanner.next();

            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("d") || estadoCivil.equalsIgnoreCase("v")) {
                System.out.println("validado com sucesso");
                valido = true;
            } else{
                System.out.println("informe uma das opções");
            }
        } while(!valido);
    
    }

}
