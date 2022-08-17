package HerancaPolimorfismo;

/**
 *
 * @author alan
 */
public class Zoologico {
    public static void main(String[] args) {
       
        Animal camelo = new Mamifero();
        camelo.setNome("camelo");
        camelo.setComprimento(150);
        camelo.setPatas(4);
        camelo.setCor("amarelo");
        camelo.setVelocidade(2.0);
        
        Animal tubarao = new Peixe();
        tubarao.setNome("tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
        
        Animal urso = new Mamifero();
        urso.setNome("urso-do-canadá");
        urso.setComprimento(180);
        urso.setCor("vermelha");
        urso.setVelocidade(0.5);
        
        Animal[] animal = new Animal[3];
        animal[0] = camelo;
        animal[1] = tubarao;
        animal[2] = urso;
        
         System.out.print("------------------------");
        for (Animal animal1 : animal) {
           
            System.out.print(animal1.toString());
            System.out.print("------------------------\n");
        }
    }  
}
