package Unit3_Oops;

public class Test1 {
    int i;                   /// int i is instance variable.
    void setvalue(int x){
        i=x;                 /// int x is local variable.
    }
    void show(){
        System.out.println(i);
    }
}
class xyz{
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.setvalue(10);
        obj.show();
    }
}

///not using  this keyword just need to substitue the value of x with i then the output will be 0
/// it is the default value of integer so we use this.i=i so this is the correct way and after that
/// the output will be 10.