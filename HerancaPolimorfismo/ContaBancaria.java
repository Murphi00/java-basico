package HerancaPolimorfismo;

/**
 *
 * @author alan
 */
public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public boolean efetuarSaque(double valorSaque) {

        if ((this.saldo - valorSaque) >= 0) {
            this.saldo -= valorSaque;
            return true;
        }
        return false;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String info = "\nCliente: " + this.nomeCliente
                + "\nSaldo: " + saldo;
        return info;
    }

}
