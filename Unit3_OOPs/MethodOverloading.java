package Unit3_Oops;
public class MethodOverloading{
 void area(int r){
    System.out.println("Area of ciecle ="+3.14*r*r);
 }
 void area(int l, int b){
    System.out.println("Area of Rectangle ="+l*b);
 }
 public static void main(String[] args) {
    MethodOverloading obj = new MethodOverloading();
    obj.area(5);
    obj.area(6,7);
 }
}