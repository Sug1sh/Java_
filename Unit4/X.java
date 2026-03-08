//Super can  be used to invoke the immidiate parent class method...
class X{
    void Display(){
        System.out.println("Displaying Function in class X");
    }
}
class Y extends X{
    void Display(){
        System.out.println("Displaying Function in class Y");
    }
    void show(){
        super.Display();    // print the top class output 
    }
    public static void main(String[] args) {
        Y obj = new Y();
        obj.show();
        
    }
}