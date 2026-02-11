
import java.util.LinkedList;

//LinkedList Implementation
public class AnimalsList {
    
    public static void main (String[]args){
        
        //faster element adding and removing but slower element access than ArrayList
        LinkedList<String> animalsList = new LinkedList<>();

        animalsList.add("Dog");
        animalsList.add("cat");
        animalsList.add("birds");

    }
}
