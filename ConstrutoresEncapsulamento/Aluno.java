/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstrutoresEncapsulamento;

/**
 *
 * @author alan
 */
public class Aluno {
    
    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas = new String[3];
    private double[][] notas = new double[3][4];
    
    public void mostrarInfo(){
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
    
    public boolean verificarAprovado(int indice) {
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
    
    public void setNotaPos(int i, int j, double nota){
        this.notas[i][j] = nota;
    }
    public void setNomeDisciplinaPos(int pos, String nome){
         this.nomeDisciplinas[pos] = nome;
    }
    
    public Aluno(String nome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
    }
    
    public Aluno(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }
    
    
}
