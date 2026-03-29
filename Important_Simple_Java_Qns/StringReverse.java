package Imp5marksqn_in_java;

class StringReverse {
    public static void main(String[] args) {
        String s = "Sugish";
        String rev = "";
        
        for(int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + rev);
    }
}


