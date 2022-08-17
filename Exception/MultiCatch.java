package Exception;

/**
 *
 * @author alan
 */
public class MultiCatch {

    public static void main(String[] args) {

        int[] numero = {4, 8, 16, 32, 64};
        int[] denom = {2, 0, 4, 0};

        for (int i = 0; i < numero.length; i++) {
            try {
                System.out.println(numero[i] + " / " + denom[i] + " = "
                        + numero[i] / denom[i]);

            } catch (Throwable e) { // exception generica
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nsegunda forma");
        for (int i = 0; i < numero.length; i++) {
            try {
                System.out.println(numero[i] + " / " + denom[i] + " = "
                        + numero[i] / denom[i]);

            } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
