
package HerancaPolimorfismo;

/**
 *
 * @author alan
 */
public class PessoaJuridica extends Contribuinte{
    
    private String cnjp;

    public String getCnjp() {
        return cnjp;
    }

    public void setCnjp(String cnjp) {
        this.cnjp = cnjp;
    }

    @Override
    public double cacularImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return "\nPessoaJuridica: CNPJ: " + cnjp + super.toString()
             + "\nValor imposto: "   + this.cacularImposto();
    }
    
    
    
}
