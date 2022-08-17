package HerancaPolimorfismo;

/**
 *
 * @author lisle
 */
public class Peixe extends Animal {

    public Peixe(){
        this.setAmbiente("mar");
        this.setPatas(0);
        this.setCor("cinza");
        this.setCaracteristicas("barbatanas e caldas");
    }
    private String caracteristicas;

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPeixe \nCaracteristicas: " + caracteristicas + "\n";
    }
}
