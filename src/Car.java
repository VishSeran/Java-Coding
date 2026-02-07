/* //This is a exercise for creating classes in Java
public class Car {

    //defining attributes
    String color;
    String topSpeed;
    String engine;
    String model;
    String year;

    //defining methods
    void displatInfo(){
        System.out.println("car model: " + model );
        System.out.println("car engine: " + engine);
        System.out.println("car color: " + color);
        
    }

    public static void main (String [] args){
        Car sportCar = new Car();
        sportCar.color = "Red";
        sportCar.model = "Supra";
        sportCar.engine = "5000cc";

        sportCar.displatInfo();
    }
}
 */



/*  What is an abstract class?

        A class that cannot create objects

        Used only as a parent (base) class

        Meant to be extended by other classes */

    abstract class SportCar {

        /* What is an abstract method?

            A method without a body

            Only the method name + return type

            Child classes must write the method body */

        abstract void type();
    }


    class LuxuaryCar extends SportCar{
        
        @Override
        void type(){
            System.err.println("This is luxuary sports car section");
        }
    }

    class Offroad extends SportCar {

        @Override
        void type(){
            System.err.println("This is offroad sport car section");
        }
    }

public class Car {

    public static void main(String[]args){

        SportCar supra = new LuxuaryCar(); //Polymorphism
        //SportCar -> Variable type
        //LuxuaryCar -> object type
        supra.type();

        SportCar pajero = new Offroad();//polymorphism
        pajero.type();
    }
}

