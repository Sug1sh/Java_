import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        

        switch(a) {
            case 1:
                System.out.println("Ronaldo");
                break;
            case 2:
                System.out.println("Messi");
                break;
            case 3:
                System.out.println("Patrick Dorgu");
                break;
            case 4:
                System.out.println("Neymar");
                break;
            case 5:
                System.out.println("Bruno Fernandez");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
