import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckExceptions {
    public static void main (String [] args){
        try {
            File myfile = new File("null");
            Scanner myReader = new Scanner(myfile);

            while(myReader.hasNext()){
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();

        } catch (FileNotFoundException  e) {
            System.err.println("The file is not found!"); //this is a checked exception
        }
    }
}
