package Unit3_Oops;

class Circle {
    void area(int r) {
        System.out.println("Area of circle = " + 3.14 * r * r);
    }

    void circumference(int r) {
        System.out.println("Circumference of circle = " + 2 * 3.14 * r);
    }
}

public class CreatingClassAndAddingMethods {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.area(5);
        obj.circumference(5);
    }
}
