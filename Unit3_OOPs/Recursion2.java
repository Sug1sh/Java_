// WAP to check palindrome using recursion.........
import java.util.Scanner;

class Palindrome {
    int rev = 0;   // class variable

    int reverse(int n) {
        if (n == 0)
            return rev;
        
        rev = rev * 10 + n % 10;
        return reverse(n / 10);
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome obj = new Palindrome();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reversed = obj.reverse(n);

        if (n == reversed)
            System.out.println(n + " is Palindrome");
        else
            System.out.println(n + " is Not Palindrome");
    }
}