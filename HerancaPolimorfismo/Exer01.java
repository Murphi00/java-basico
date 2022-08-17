package HerancaPolimorfismo;

/**
 *
 * @author alan
 */
public class Exer01 {

    public static void main(String[] args) {

        System.out.println("Teste conta bancaria");
        ContaBancaria c = new ContaBancaria();
        c.setNomeCliente("alan");
        c.setNumConta("xxxxxx");
        c.setSaldo(20.88);

        realizarSaque(c, 89);
        System.out.println(c);

        System.out.println("\nTeste conta poupança");
        ContaPoupanca p = new ContaPoupanca();
        p.setNomeCliente("alan");
        p.setNumConta("xxxxxx");
        p.setSaldo(20);
        p.setDiaRendimento(21);

        verificarRedimento(p, 100);
        realizarSaque(p, 20);
        System.out.println(p);

        System.out.println("\nTeste conta especial");
        ContaEspecial ce = new ContaEspecial();
        ce.setLimite(200);
        ce.setNomeCliente("andri");
        ce.setSaldo(20);

        realizarSaque(ce, 60);
        System.out.println(ce);
    }

    public static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.efetuarSaque(valor)) {
            System.out.println("Saque efetuado no valor de: " + valor);
        } else {
            System.out.println("saldo insuficiente");
        }
    }

    public static void verificarRedimento(ContaPoupanca c, double taxa) {
        if (c.calcularNovoSaldo(taxa)) {
            System.out.println("hoje é dia de redimento. Novo Saldo: " + c.getSaldo());
        } else {
            System.out.println("hoje não é dia de redimento");
        }
    }
}
