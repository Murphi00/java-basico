package Intefaces;

/**
 *
 * @author alan
 */
public class Cilindro extends Figura3D {

    private double altura;
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * Math.pow(this.raio, 2) * this.altura;
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.pow(raio, 2) * Math.PI;
        double areaLateral = 2 * Math.PI * this.altura * this.raio;
        double areaTotal = (2 * areaBase) + areaLateral;

        return areaTotal;
    }

}
