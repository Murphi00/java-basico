/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstrutoresEncapsulamento;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer03 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {
        
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("digite o nome do aluno: ");
        aluno.setNome(scanner.next());
        System.out.println("digite a matricula: ");
        aluno.setMatricula(scanner.next()); 
        System.out.println("digite o nome do curso: ");
        aluno.setNomeCurso(scanner.next());
        
        for(int i = 0; i < aluno.getNomeDisciplinas().length; i++){
            System.out.println("digite o nome da disciplina: " + i);
            aluno.setNomeDisciplinaPos(i, scanner.next());
            
            for(int j = 0; j < aluno.getNotas()[i].length; j++){
                System.out.println("digite a nota " + (j+1) );
                aluno.setNotaPos(i, j, scanner.nextDouble());
            } 
        } 
        
        aluno.mostrarInfo();
        
        for(int i = 0; i < aluno.getNomeDisciplinas().length; i ++){
            if(aluno.verificarAprovado(i)){
                System.out.println("aluno aprovado na disciplina: " + aluno.getNomeDisciplinas()[i]);
            } else{
                System.out.println("aluno não foi aprovado na disciplina: " + aluno.getNomeDisciplinas()[i]);
            }
        }
    }
    
}
