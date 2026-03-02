package bca3rdsemjava.unit3_oops;

class Time {
    int hours;
    int minutes;
    int seconds;

    // Constructor
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Simple display method (no printf)
    void display() {
        System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds);
    }

    // Add two Time objects
    Time add(Time t) {
        int h = this.hours + t.hours;
        int m = this.minutes + t.minutes;
        int s = this.seconds + t.seconds;

        if (s >= 60) {
            m += s / 60;
            s = s % 60;
        }

        if (m >= 60) {
            h += m / 60;
            m = m % 60;
        }

        return new Time(h, m, s);
    }

    // Subtract two Time objects
    Time subtract(Time t) {
        int h = this.hours - t.hours;
        int m = this.minutes - t.minutes;
        int s = this.seconds - t.seconds;

        if (s < 0) {
            s += 60;
            m -= 1;
        }

        if (m < 0) {
            m += 60;
            h -= 1;
        }

        return new Time(h, m, s);
    }
}

public class TimeDemo {
    public static void main(String[] args) {

        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 20, 30);

        System.out.println("Time 1:");
        t1.display();

        System.out.println("Time 2:");
        t2.display();

        Time sum = t1.add(t2);
        System.out.println("Sum:");
        sum.display();

        Time diff = t1.subtract(t2);
        System.out.println("Difference:");
        diff.display();
    }
}