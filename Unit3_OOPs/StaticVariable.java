// Belong to the class rather than the object of the class

public class StaticVariable {
    static int a = 10;
}
class demo{
    public static void main(String[] args) {
        System.out.println(StaticVariable.a);  // calling class and then the 
                                               //output willbe displayed on the screen.
    }
}
