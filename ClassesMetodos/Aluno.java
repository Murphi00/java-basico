/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetodos;


/**
 *
 * @author alan
 */
public class Aluno {
    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double[][] notas = new double[3][4];
    void mostrarInfo(){
        System.out.println("nome: " + nome);
        System.out.println("matricula: " + matricula);
        System.out.println("nome do curso: " + nomeCurso);
        
        for(int i = 0; i < nomeDisciplinas.length; i ++){
            System.out.println("nome da disciplina: " + nomeDisciplinas[i]);
            for(int j = 0; j < notas[i].length; j ++){
                System.out.print("nota: " + notas[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    boolean verificarAprovado(int indice) {
        double soma = 0;
        for (int i = 0; i < notas[indice].length; i++) {
            soma += notas[indice][i];

            double media = soma / notas[indice].length;
            if (media >= 7) {
                return true;
            }
        }
        return false;
    }
}
