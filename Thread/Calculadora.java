package Thread;

/**
 *
 * @author alan
 */
public class Calculadora {
   private int soma;
   
   public int somarArray(int[] array){
       
       for(int i = 0; i < array.length; i++){
           soma+= array[i];
           
           System.out.println("executando a soma" + Thread.currentThread());
           try {
               Thread.sleep(200);
           } catch (InterruptedException ex) {
               System.out.println(ex.getMessage());
           }
       }
       
       return this.soma;
   }
} 
