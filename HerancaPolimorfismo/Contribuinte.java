
package HerancaPolimorfismo;

/**
 *
 * @author alan
 */
public abstract class Contribuinte {
    private String name;
    private double rendaBruta;
    
    
    public abstract double cacularImposto();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    
    
    @Override
    public String toString() {
        return "\nContribuinte: nome: " + this.name +
                "\nrenda bruta: " + this.getRendaBruta();
    }
    
    
}
