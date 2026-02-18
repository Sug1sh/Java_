
//this can be used to refer the current class instance variable.........
package Unit3_Oops;
public class Test {
    int a;
    int b;

    Test(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("a = "+a+ "  "+ "b = "+b);
    }
    public static void main(String[] args) {
        Test obj = new Test(5,7);
        obj.display();
    }
}

