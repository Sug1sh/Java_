
//WAP to Find the reverse of a number using recursion.......

package bca3rdsemjava.unit3_oops;
import java.util.Scanner;
public class Fibonacci {
    int fib(int n){
        if(n<=1)
            return n;
        else
            return(fib(n-1)+fib(n-2));
    }
}
 class Recursion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fibonacci obj=new Fibonacci();
        int n;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(obj.fib(i) +"\t");
        }
    }
}