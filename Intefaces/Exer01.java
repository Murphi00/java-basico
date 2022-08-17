
package Intefaces;

/**
 *
 * @author alan
 */
public class Exer01 {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        
        quadrado.setCor("lilas");
        quadrado.setLado(2);
        quadrado.setNome("quadradin");
        
        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.setNome("Circulo");
        
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(2);
        triangulo.setBase(3);
        triangulo.setNome("Triangulo");
        
        Cubo cubo = new Cubo();
        cubo.setLado(3);
        cubo.setNome("Cubo");
        
        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(2);
        cilindro.setRaio(3);
        cilindro.setNome("Raio");
        
        Piramide piramide = new Piramide();
        piramide.setAltura(3);
        piramide.setApotema(4);
        piramide.setArestaBase(2);
        piramide.setBase(quadrado);
        piramide.setNumPoliBase(4);
        piramide.setNome("Piramide");
        
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = quadrado;
        figuras[1] = circulo;
        figuras[2] = circulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramide;
        
        for(FiguraGeometrica figura : figuras){
            System.out.println("------------");
            System.out.println(figura.getNome());
            
            if(figura instanceof Figura2D){
                Figura2D f2 = (Figura2D) figura;
                System.out.println("Area da figura: " + f2.calcularArea());
            } 
            
            if(figura instanceof Figura3D){
                Figura3D f3 = (Figura3D) figura;
                System.out.println("Volume da figura: " + f3.calcularVolume());
            }
        }
    }
    
}
