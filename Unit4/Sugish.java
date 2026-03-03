/*Using the extends keywors so we can use eat methods under the class Dog*/
package Unit4_Inheritance_And_Packages;
class Sugish {
    void love(){
        System.out.println("Sugish loves nisha and nisha loves sugish ");
    }
}
     class Nisha extends Sugish{
        public static void main(String[] args) {
            Nisha obj = new Nisha();
            obj.love();
        }
     }
     