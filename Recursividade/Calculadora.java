/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;

/**
 *
 * @author alan
 */
public class Calculadora {
   
    public static int fatorial(int num){
        if(num < 2){
            return 1;
        }
        return num * fatorial(num -1);
    }
    
    public static int fibonnaci(int num){
       if(num < 2){
            return 1;
        }
       
        return fibonnaci(num - 1) + fibonnaci(num - 2);
    }
    /* 5 = 5 + 4 + 3 + 2 + 1
    4 = 4 + 3 + 2 + 1
    3 = 3 + 2 + 1
    2 =  2 + 1
    1 = 1
    */
    public static int somatorio(int num){
        if(num == 1){
            return 1;
        }
        
        return num + somatorio(num -1);
    }
}
