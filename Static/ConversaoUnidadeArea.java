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
public class ConversaoUnidadeArea {
   
    public static double conversao(double num, double unity) {
       /* if (num == 0) {
            return 1;
        } */
        
        double total = 1;
        for(int i = 1; i <= num; i++){
            total = i * unity;
        }
        
        //num--;
        return total;
    }
    
    public static void imprimir(double num){
         System.out.println(num);
     }
}
