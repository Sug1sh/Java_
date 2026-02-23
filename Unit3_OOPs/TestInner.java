class Outer {

    int number = 10;   // outer class variable

    class Inner {      // inner class
        void show() {
            System.out.println("Number is: " + number);
        }
    }
}

public class TestInner {
    public static void main(String[] args) {

        Outer outerObj = new Outer();          // create outer object
        Outer.Inner innerObj = outerObj.new Inner();  // create inner object

        innerObj.show();
    }
}