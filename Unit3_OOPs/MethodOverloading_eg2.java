package Unit3_Oops;

public class MethodOverloading_eg2 {
    void sum(int a, int b){
        System.out.println("The sum of two numbers = "+(a+b));
    }
    void sum(int a, int b, int c){
        System.out.println("The sum of three numbers " +(a+b+c));
    }
    public static void main(String[] args) {
        MethodOverloading_eg2 obj = new MethodOverloading_eg2();   //Object
        obj.sum(5,5);    //a+b = 5+5=10              
        obj.sum(5,5,5); //a+b+c = 5+5+5=15          
    }

}
