package Unit5_Handling_Errors_Exception;
public class ArrayIndexOutOfBoundsExceptionExample{
    public static void main(String[] args) {
        try {
            int a[]={1,2,3,4};
            System.out.println(a[4]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    
}

    
    