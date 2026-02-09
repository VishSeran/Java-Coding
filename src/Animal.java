
/* 
    Ploymorphism have to types:
        1.Compile time polymorphism: the methods in the same class and the same names which is
        only different from the parameters types and number which they used.
        2.Runtime Polymorphism: its ddecide the method when the runtime (based on the object type).
 */
//runtime polymorphism
public class Animal {

    protected String name ;
    protected String type ;
    protected String color ;

    public void sound() {
        System.out.println("animals make sound");
    }
}

class Dog extends Animal{

    @Override
  public void sound(){
        System.out.println("Dogs are barking");
    }
}

class Cat extends Animal {
    public void sound(){
        System.out.println("Cats are meow");
    }
}
