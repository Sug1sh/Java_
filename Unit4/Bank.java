package Unit4_Inheritance_And_Packages;

abstract class Bank {
    abstract int Interest();
}

class NBL extends Bank{
    int Interest(){
        return 7;
    }
}

class GIB extends Bank{
    int Interest(){   // corrected (I capital)
        return 8;
    }
}

class Abstraction{
    public static void main(String[] args) {
        Bank obj1 = new NBL();
        System.out.println("The rate of interest of Nepal Bank Limited is: "+obj1.Interest()+"%");

        Bank obj2 = new GIB();
        System.out.println("The rate of interest of Global IME Bank is: "+obj2.Interest()+"%");
    }
}