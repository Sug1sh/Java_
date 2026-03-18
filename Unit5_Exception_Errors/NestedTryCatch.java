package Unit5_Handling_Errors_Exception;

public class NestedTryCatch {
    public static void main(String[] args) {

        try {

            try {
                int a = 10 / 0;
            }
            catch (ArithmeticException e) {
                System.out.println(e);
            }

            try {
                int b[] = {1, 2, 3, 4};
                System.out.println(b[8]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        }
        catch (Exception e) {
            System.out.println("The error is handled");
        }

    }
}