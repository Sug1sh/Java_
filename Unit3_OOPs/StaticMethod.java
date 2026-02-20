public class StaticMethod {
    static void display(){
        System.out.println("You're fully compromised");
    }
    public static void main(String[] args) {
        StaticMethod.display();
    }
}
