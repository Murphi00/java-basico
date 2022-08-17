/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *
 * @author alan
 */
public class Calculadora {
    
    public static int somar(int n1, int n2){
        return n1 + n2;
    }
    
    public static double subtrair(double n1, double n2){
        return n1 - n2;
    }
    
    public static double dividir(double n1, double n2){
        return n1 / n2;
    }
    
    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }
    
    public static double potencia(int n1, int n2){
        return Math.pow(n1, n2); //potencia de um numero
    }
    
    public static void imprimir(double num){
         System.out.println(num);
     }
    
    //5! = 5 x 4 x 3 x 2 x 1
    //0! = 1
    public static int fatorial(int num){
        if(num == 0){
            return 1;
        }
        
        int total = 1;
        for(int i = num; i >1; i --){
            total*= i;
        }
        
        return total;
    }
    
    public static double conversao(double num) {
        if (num == 0) {
            return 1;
        }
        
        double total = 1;
        for(int i = 0; i < num; i++){
            total*= num * 10.76;
        }
        num--;
        return total;
    }
}
