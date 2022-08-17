/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetodos;

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
        Aluno aluno = new Aluno();
        
        System.out.println("digite o nome do aluno: ");
        aluno.nome = scanner.next();
        System.out.println("digite a matricula: ");
        aluno.matricula = scanner.next(); 
        System.out.println("digite o nome do curso: ");
        aluno.nomeCurso = scanner.next();
        System.out.println("digite ");
        
        for(int i = 0; i < aluno.nomeDisciplinas.length; i++){
            System.out.println("digite o nome da disciplina: " + i);
            aluno.nomeDisciplinas[i] = scanner.next();
            
            for(int j = 0; j < aluno.notas[i].length; j++){
                System.out.println("digite a nota " + (j+1) );
                aluno.notas[i][j] = scanner.nextDouble();
                System.out.println(i);
                System.out.println(j); 
            } 
        } 
        
        aluno.mostrarInfo();
        
        for(int i = 0; i < aluno.nomeDisciplinas.length; i ++){
            if(aluno.verificarAprovado(i)){
                System.out.println("aluno aprovado na disciplina: " + aluno.nomeDisciplinas[i]);
            } else{
                System.out.println("aluno não foi aprovado na disciplina: " + aluno.nomeDisciplinas[i]);
            }
        }
    }
    
}
