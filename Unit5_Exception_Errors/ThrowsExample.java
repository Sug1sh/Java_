class ThrowsExample{
    static void divide() throws ArithmeticException{
        int a = 10/0;
    }
    public static void main(String[] args) {
        try{
            divide();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("You cannot divide by zero");
    }
}