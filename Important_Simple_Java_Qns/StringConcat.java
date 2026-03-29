

/* Write a program to read two string from user and perform comparison and concatenation
of two strings.*/
package Imp5marksqn_in_java;

import java.util.Scanner;

class StringConcat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter First String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String: ");
        String s2 = sc.nextLine();
       
        //for concatination      
        String con = s1.concat(s2);
        System.out.println(con);
        
        //comparing
        if(s1.equals(s2)){
            System.out.println("The string is equal");
        }
        else{
            System.out.println("The String is not equal");
        }
        
        
    }
}