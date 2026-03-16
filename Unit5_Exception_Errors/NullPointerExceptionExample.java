package Unit5_Handling_Errors_Exception;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try{
           String name = null;
            System.out.println(name.length());
        }
        catch(NullPointerException e){
            System.out.println("This is NullPointer Exception in java");
        }
    }
}









