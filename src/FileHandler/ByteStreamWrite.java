
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class ByteStreamWrite {

   public static void main (String [] args){
    
    FileOutputStream fileOutputStream = null;

    try {
        fileOutputStream = new FileOutputStream("FileOutputNew.txt");
        BufferedOutputStream bufferWriter =  new BufferedOutputStream(fileOutputStream);

        String text = "This is nonsense. but it is use to create some file stream outputs and practise. here is the number 123123123";

        byte [] byteData = null;

        bufferWriter.write(byteData);
        fileOutputStream.close();
    } catch (IOException e) {
        System.out.println("invalid input!");
    }
   }
}
