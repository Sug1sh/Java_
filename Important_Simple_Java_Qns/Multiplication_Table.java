package Important_Simple_Exam_Qn;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a =sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(+a+"x"+i+"="+a*i);

        }
    }
}
