class Employee{
    int empid;
    String name;
    String company;
    Employee(int empid, String name, String company){
        this.empid = empid;
        this.name = name;
        this.company = company;
    }
    void display(){
        System.out.println(empid+" "+name+" "+company);
    }
    public static void main(String[] args) {
        Employee obj1 = new Employee(1 ,"Sugish", "Microsoft");
        Employee obj2 = new Employee(2, "Nisha", "AWS");
        obj1.display();
        obj2.display();
    }
}