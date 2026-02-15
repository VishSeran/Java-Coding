
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {

    public static void main(String []args){

        try {

           FileWriter writter = new FileWriter("output.txt");
           BufferedWriter bufferWritter = new BufferedWriter(writter);

           bufferWritter.write("This is a new file writing, so be confused!");
           bufferWritter.newLine();
           bufferWritter.write("Here the new line is begun!");

           bufferWritter.close();

           System.out.println("File wrote successfully");


        } catch (IOException e) {
            System.out.println("File not found" + e.getMessage());
        }

        


    }
    
}
