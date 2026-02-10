
public class BulbOperate {

    public static void main(String[] args) {
        // Create an array of Switchable objects to hold different types of bulbs
        Switchable[] switchables = new Switchable[3];

        // Create instances of SmartBulb, DimmableBulb, and RegularBulb
        SmartBulb sb = new SmartBulb();
        DimmeableBulb db = new DimmeableBulb();
        RegularBulb rb = new RegularBulb();

        // Populate the array with the bulb instances
        switchables[0] = sb;
        switchables[1] = db;
        switchables[2] = rb;

        // Loop through the array and turn each bulb on and off
        for (int i = 0; i < switchables.length; i++) {
            switchables[i].turnOn();
            switchables[i].turnOff();
        }

        // Increase brightness of the SmartBulb directly
        sb.increase();

        // Decrease brightness of the DimmableBulb by casting to Adjustable
        ((Adjustable) switchables[1]).decrease();

        // Connect the SmartBulb to the network by casting to Connectable
        ((Connectable) switchables[0]).connected();
    }
}
