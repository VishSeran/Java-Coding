package Common;
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


        /* Vehicle myLorry = new HeavyVehicles();
        myLorry.sound();
        myLorry.start(); */

        Transport carTransport = new LightVehicle();
        carTransport.fee();
        carTransport.passengers();
        
        LightVehicle myVan = new LightVehicle();
        myVan.fee();
        myVan.passengers();
        myVan.sound();
        myVan.start();

    }
}
