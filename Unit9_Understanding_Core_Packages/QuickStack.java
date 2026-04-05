package Unit9_Understanding_Core_Packages;

import java.util.Stack;

public class QuickStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        s.push(10);
        s.push(20);
        s.push(30);
        
        System.out.println("Stack: " + s);      
        System.out.println("Pop: " + s.pop()); 
        System.out.println("Peek: " + s.peek()); 
        System.out.println("Empty? " + s.empty());
    }
}