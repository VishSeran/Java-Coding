
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {

    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;

        try {
            //FileOutputstream is used to write bytedata to a file
            fileOutputStream = new FileOutputStream("fileOutputStream.txt");
            BufferedOutputStream bufferwriter = new BufferedOutputStream(fileOutputStream);
            //BufferedOutputStream bufferWritterOutputStream = new BufferedOutputStream(fileOutputStream);
            String text = "This is a text 962 to write in the file 2nd version. Please use it!";
            byte[] byteData = text.getBytes();

            bufferwriter.write(byteData);
            bufferwriter.close();
            
        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
