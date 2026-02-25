
//WAP to Find the Factorial using Recursion.
import java.util.Scanner;
class factorial{
    int fact(int n){
        if (n==1)
            return 1;
        else
            return(n*fact(n-1));
    }
}
public class Recursion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        factorial obj=new factorial();
        int n;            //recursion
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        System.out.println("Factotial of "+n+" is "+obj.fact(n));
        }
    }

