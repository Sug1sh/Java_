package Unit3_Oops;

public class B {
    int length,breadth;
    B(int l, int b){
        length=l;
        breadth=b;
    }
    void area(){
        System.out.println("This is parameterized constructor");

    }
    public static void main(String[] args) {
        B obj = new B(5,10);
        obj.area();
    }
}
