package Unit4_Inheritance_And_Packages;

class A {
    int a = 10;
}

public class B extends A{
    int a = 20;

    void show(){
  
        System.out.println(a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

