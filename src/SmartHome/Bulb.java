


interface Switchable {

    void turnOn();

    void turnOff();
}

interface Adjustable {

    void increase();

    void decrease();
}

interface Connectable {

    void Connected();

    void Disconnected();
}

class SmartBulb implements Switchable, Adjustable, Connectable {

    private Boolean isOn = false;
    private int brightness = 50;
    private Boolean isConnected = false;

    @Override
    public void turnOn(){
       isOn = true;
       System.out.println("Smart bulb is turned ON");
    } 

    @Override
    public void turnOff(){
        isOn = false;
        System.out.println("Smart bulb is turned OFF");
    }

    @Override
    public void increase(){
        if(brightness <= 100){
            brightness += 10;
            System.out.println("Brightness: " + brightness + "%");
        }else{
            System.out.println("Brightness already at the Maximum");
        }
    }

    @Override
    public void decrease(){
        if(brightness > 0) {
            brightness -= 10;
            System.out.println("Brightness: " + brightness + "%");
        }else{
            System.out.println("Brightness already at minimum");
        }
    }

    @Override
    public void Connected(){
        isConnected = true;
        System.out.println("Smart bulb is connected");
    }

    @Override
    public void Disconnected(){
        isConnected = false;
        System.out.println("Smart bulb is disconnected");
    }

}

class 


