/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread;

/**
 *
 * @author Alan
 */
public class MinhaThread implements Runnable{
    
    private String name;
    private int[] nums;
    private static Calculadora cal = new Calculadora();
   
    public MinhaThread(String name, int[] nums){
        this.name = name;
        this.nums = nums;
        new Thread(this, name).start();
        
        Thread thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(this.name + " Iniciada");
        
        int soma = cal.somarArray(nums);
        System.out.println("resultado da soma da thread " + this.name + "é: " + soma);
        
        System.out.println(this.name + " finalizada");
    }
}
