
package Unit5_Handling_Errors_Exception;
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
           int a = Integer.parseInt("Sugish Devkota");
        } 
        catch (NumberFormatException e) {
            System.out.println("This is NumberFormatExceptionExample");
        }
    }
}
