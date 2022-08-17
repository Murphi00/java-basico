package Exception;

/**
 * @author alan
 */
public class TryCatch {

    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("antes do erro");
            vetor[4] = 1;

            System.out.println("apos o erro");
        } catch (Exception exception) {
            System.out.println(exception.toString());
            System.out.println(exception.getMessage());
            System.out.println(exception.getLocalizedMessage());
            System.out.println(exception.getCause());
            System.out.println(exception.getClass());

        }

        System.out.println("apos a exception");
    }
}
