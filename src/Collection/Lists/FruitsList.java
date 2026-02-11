
import java.util.ArrayList;


//ArrayList Implementation
public class FruitsList {
    public static void main (String[]args){


        ArrayList<String> fruits = new ArrayList<>();

        //elemnts adding
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Pineapple");

        System.out.println("Fruits List: " + fruits);
        

        //elemnts removing
        fruits.remove(2);
        System.out.println("Fruits List: " + fruits);

        String fruit_1 = fruits.get(1);
        System.out.println("fruit in postion 1: " + fruit_1);
    }
}
