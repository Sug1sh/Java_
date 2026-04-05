package Unit9_Understanding_Core_Packages;

//now lets learn autoboxing..............


/*Autoboxing is a automatic conversion of primitive type into wrapper class*/
class MyClass{
    public static void main(String[] args) {
        int a = 10; /// autoboxing
        int b = Integer.valueOf(10); 
        System.out.println(a);
        System.out.println(b);
    }
    
    
}

