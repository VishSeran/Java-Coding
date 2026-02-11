

import java.util.HashMap;

public class HashMapExample {
    
    public static void main(String[]args){


        //hashmap and treemap allow null values.
        //hashmap does not gurantee the data exists
        //treemap store the key as sorted order
        //keys must be unique
        //values can duplicate

        HashMap<String, Integer> age = new HashMap<>();

        age.put("Nimal", 30);
        age.put("Sunitha", 30);
        age.put("Nimal", 40);//ignore the duplicate key

        System.out.println("age list: " + age);
    }
}
