
import java.util.HashSet;

//HashSet implementation
public class HashsetExample {

    public static void main(String[] args) {

        //hashset is does not maintain any order but its not allow to store duplicates items.
        //also hashset allow null values.
        HashSet<String> colorsSet = new HashSet<>();

        colorsSet.add("Red");
        colorsSet.add("Blue");
        colorsSet.add("Green");
        colorsSet.add("Red");//Duplicate items ignore
        colorsSet.add("red");

        System.out.println("colorsset: " + colorsSet);

        /*
            output: colorsset: [Red, red, Blue, Green]

            ❌ Not insertion order
            ❌ Not sorted order
            ✅ Hash bucket order

            hash("red") mapped to an earlier bucket index
            than "Blue" and "Green"
         */
    }
}
