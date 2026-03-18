class FinallyKeyword{
    public static void main(String[] args) {
        try{
            int a=10,b=0,c;
            c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("The finally keyword is using ");
    }
        System.out.println("The program continuesss........");
    }
}