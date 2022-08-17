package Intefaces;

/**
 *
 * @author alan
 */
public class Piramide extends Figura3D {

    private double altura;
    private double arestaBase;
    private double apotema;
    private Figura2D base;
    private int numPoliBase;

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public double calcularVolume() {
        if (this.base != null) {
            return (base.calcularArea() * this.altura) / 3;
        }

        return 0;
    }

    @Override
    public double calcularArea() {
        if (base != null) {
            return this.numPoliBase * ((this.arestaBase * this.apotema) / 2)
                    + base.calcularArea();
        }

        return 0;
    }

}
