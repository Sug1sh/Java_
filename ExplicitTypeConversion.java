//Explicit TypeConversion and TypeCasting is same
 
public class ExplicitTypeConversion {
    public static void main(String args[]){
    double d = 100.5;
    float f = (float)d;
    long l = (long)d;
    short s = (short)l;

    System.out.println("float value: "+f);
    System.out.println("Double Value: "+d);
    System.out.println("Long Value: "+l);
    System.out.println("Short Value: "+s);
    }
}
