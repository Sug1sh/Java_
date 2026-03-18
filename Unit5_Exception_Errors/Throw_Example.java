package Unit5_Handling_Errors_Exception;
public class Throw_Example {
    public static void main(String[] args) {
        int age = 15;
        if (age<18) {
            throw new ArithmeticException("You cannont vote to balen shah");
            
        }
        else{
            System.out.println("YOu can vote ");
        }
    }
}
