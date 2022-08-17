
package Intefaces;

/**
 *
 * @author alan
 */
public class Circulo extends Figura2D{
    
    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.raio, 2) * Math.PI;
    }
     
}
