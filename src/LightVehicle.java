
/* public class LightVehicle implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }
    
    @Override
    public void sound() {
        System.out.println("Light vehicle sound");
    }
    
} */

public class LightVehicle extends Transport implements Vehicle {

    @Override
    public void fee(){
        System.out.println("pay fee for the light vehicle");
    }

    @Override
    public void sound(){
        System.out.println("light vehicle sound");
    }

    @Override
    public void start(){
        System.out.println("Light vehicle start");
    }

}
