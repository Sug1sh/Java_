package Unit5_Handling_Errors_Exception;

import java.util.Scanner;

public class HandlingExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("We cannot divide a number by 0");
        }
        
    }
}
