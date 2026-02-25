// WAP to find the reverse of a number using recursion.
import java.util.Scanner;

class ReverseNumber {
    int reverse(int n, int rev) {
        if (n == 0)
            return rev;
        else
            return reverse(n / 10, rev * 10 + n % 10);
    }
}

public class Recursion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseNumber obj = new ReverseNumber();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = obj.reverse(n, 0);

        System.out.println("Reverse of " + n + " is " + result);
        sc.close();
    }
}