package Exception;

/**
 *
 * @author alan
 */
public class Finally {

    public static void main(String[] args) {
        int[] numero = {4, 8, 16, 32, 64};
        int[] denom = {2, 0, 4, 0};

        for (int i = 0; i < numero.length; i++) {
            try {
                System.out.print(numero[i] + " / " + denom[i] + " = "
                        + numero[i] / denom[i]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.print("\nposição invalida");

            } catch (ArithmeticException e) {
                System.out.print("\nerro ao dividir por zero");
                System.exit(0);

            } finally {
                System.out.println("\npassando pelo finally\n");
            }
        }
    }
}
