
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class ByteStreamRead {

    public static void main(String []args){

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("fileOutputStream.txt");
            BufferedInputStream bufferReader = new BufferedInputStream(fileInputStream);

            int byteData;

            while((byteData = bufferReader.read()) != -1){
                System.out.println("file says by numbers: " + byteData);
                System.out.println("file says by chars: " + (char)byteData);
            }

            fileInputStream.close();

        } catch (IOException e) {
            System.out.println("Invalid input: " +e.getMessage());
        }
    }
}
