package Unit3_Oops;

public class Test2 {
    int i;                   /// int i is instance variable.
    void setvalue(int i){
      this.i=i;                 /// int x is local variable.
    }
    void show(){
        System.out.println(i);
    }
}
class samdi{
    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.setvalue(10);
        obj.show();
    }
}