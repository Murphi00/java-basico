package HerancaPolimorfismo;

import java.util.Calendar;

/**
 *
 * @author alan
 */
public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public boolean calcularNovoSaldo(double taxaRedimento) {
        Calendar hoje = Calendar.getInstance();

        if (hoje.get(Calendar.DAY_OF_MONTH) == this.diaRendimento) {
            this.setSaldo(this.getSaldo() + ((this.getSaldo() * taxaRedimento) / 100));
            return true;
        }

        return false;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca \n" + "Dia de rendimento: "
                + diaRendimento + super.toString();
    }

}
