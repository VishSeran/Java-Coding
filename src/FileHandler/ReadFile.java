
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ReadFile {
    
   public static  void main (String []args){
        try {

            //FileReader and FileWriter in the character stream -only read and write characters
            FileReader reader = new FileReader("output.txt");
            BufferedReader bufferReader = new BufferedReader(reader);

            String line;
            while((line= bufferReader.readLine()) != null){
                System.out.println(line);
            }
            bufferReader.close();
        } catch (IOException e) {
            System.out.println("Error message: "+e.getMessage());
        }
   }
    
}
