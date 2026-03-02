package bca3rdsemjava.unit3_oops;

class Distance {

    private int feet;
    private int inches;

    // Constructor
    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // displayDistance method
    void displayDistance() {
        System.out.println(this.feet + " feet " + this.inches + " inches");
    }

    // addDistance method
    Distance addDistance(Distance d) {

        int f = this.feet + d.feet;
        int i = this.inches + d.inches;

        if (i >= 12) {
            f += i / 12;
            i = i % 12;
        }

        return new Distance(f, i);
    }

    // subtractDistance method
    Distance subtractDistance(Distance d) {

        int f = this.feet - d.feet;
        int i = this.inches - d.inches;

        if (i < 0) {
            i += 12;
            f -= 1;
        }

        return new Distance(f, i);
    }
}

public class MyDistance {

    public static void main(String[] args) {

        Distance d1 = new Distance(5, 8);
        Distance d2 = new Distance(3, 10);

        System.out.println("Distance 1:");
        d1.displayDistance();

        System.out.println("Distance 2:");
        d2.displayDistance();

        Distance sum = d1.addDistance(d2);
        System.out.println("Sum:");
        sum.displayDistance();

        Distance diff = d1.subtractDistance(d2);
        System.out.println("Difference:");
        diff.displayDistance();
    }
}