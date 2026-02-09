public class Main {
      public static void main(String[] args) {
        /* Dog mydog = new Dog();
        mydog.name = "Buddy";
        mydog.color  = "Black";
        mydog.status = "puppy";

        mydog.sound(); */

        //compile-time polymorphism
       /*  MathsOperations maths = new MathsOperations();
        maths.add(2, 3);
        maths.add(2.45f, 3.45f);
        maths.add(3.654d,5.765d);
 */     

        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();
    }
}
