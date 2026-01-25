class Garbage_Collection{
    public static void main(String[] args) {
        Garbage_Collection obj = new Garbage_Collection();
        obj=null;
        System.gc();
    }
    protected void finalize(){
        System.out.println("The value is garbage collected ");
    }
}