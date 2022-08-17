package HerancaPolimorfismo;

/**
 *
 * @author alan
 */
public class ContaEspecial extends ContaBancaria {

    private double limite;

    @Override
    public boolean efetuarSaque(double valorSaque) {
        double saldoEspecial = this.getLimite() + this.getSaldo();

        if ((saldoEspecial - valorSaque) >= 0) {
            this.setSaldo(this.getSaldo() - valorSaque);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Conta Especial" + " Limite: " + this.limite
                + super.toString();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
