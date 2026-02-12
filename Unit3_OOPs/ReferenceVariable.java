package Unit3_Oops;

class ReferenceVariable {
    String color;
    int age;
    public static void main(String[] args) {
        ReferenceVariable sc=new ReferenceVariable();
        sc.color = "Black";
        sc.age = 10;
        System.out.println(sc.color+" "+sc.age  );
    }
}