package HerancaPolimorfismo;

/**
 *
 * @author alan
 */
public class Mamifero extends Animal{

    private String alimento;
    
    public Mamifero(){
        this.setAmbiente("terra");
        this.setPatas(4);
        this.setAlimento("mel");
    }
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMamifero \nAlimento: " + alimento + "\n";
    }

}
