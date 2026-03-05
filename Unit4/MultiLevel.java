import java.util.Scanner;

class A{
    String name;
    Scanner sc = new Scanner(System.in);

    void getName(){
        System.out.println("Enter Name: ");
        name = sc.nextLine();
    }

    void displayName(){
        System.out.println("Name = " + name);
    }
}

class B extends A{
    int age;

    void getAge(){
        System.out.println("Enter Age: ");
        age = sc.nextInt();
    }

    void displayAge(){
        System.out.println("Age = " + age);
    }
}

class C extends B{
    String college;

    void getCollege(){
        sc.nextLine();   // clear buffer
        System.out.println("Enter College Name: ");
        college = sc.nextLine();
    }

    void displayCollege(){
        System.out.println("College Name = " + college);
        
        
    }
}

public class MultiLevel{
    public static void main(String[] args){
        C obj = new C();

        obj.getName();
        obj.getAge();
        obj.getCollege();

        obj.displayName();
        obj.displayAge();
        obj.displayCollege();
    }
}