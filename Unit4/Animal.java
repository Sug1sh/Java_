
package Unit4_Inheritance_And_Packages;
class Animal {
    void eat(){
        System.out.println("The animal is eating");
    }
}
     class Dog {
        public static void main(String[] args) {
            Dog obj = new Dog();
            obj.eat();
        }
     }
        /*The program will not compile because the Dog class cannot access the eat() mrthod of the 
          Animal class inless inheritance is used. To access the method, we must use the extends
          keyword so the Dog inherits the properties of Animal.
