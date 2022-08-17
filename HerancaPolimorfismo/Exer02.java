
package HerancaPolimorfismo;

import java.util.Scanner;

/**
 * @author alan
 */
public class Exer02 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        Contribuinte[]  contribuinte = new Contribuinte[4];
       
        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setName("alan");
        pj1.setCnjp("19.009.357/0001-69");
        pj1.setRendaBruta(1000);
        
        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.setName("andri");
        pj2.setCnjp("19.009.357/0001-69");
        pj2.setRendaBruta(10);
        
        PessoaFisica pf1 = new PessoaFisica();
        pf1.setName("alan");
        pf1.setCpf("528.460.000-26");
        pf1.setRendaBruta(2300);
        
        PessoaFisica pf2 = new PessoaFisica();
        pf2.setName("andri");
        pf2.setCpf("528.460.000-26");
        pf2.setRendaBruta(3600);
        
        contribuinte[0] = pj1;
        contribuinte[1] = pj2;
        contribuinte[2] = pf1;
        contribuinte[3] = pf2;
        
        for (Contribuinte contribuinte1 : contribuinte) {
            System.out.println(contribuinte1.toString());
        }
    }
    
}
