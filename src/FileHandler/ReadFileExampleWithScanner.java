
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadFileExampleWithScanner {

    public static void main(String[] args) {

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the file path: ");
        String path = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader(path);

            Scanner fileScanner = new Scanner(fileReader);

            while(fileScanner.hasNext()){
                String fileLine = fileScanner.nextLine();
                System.out.println(fileLine);
            }
        } catch (IOException e) {
            System.out.println("Error");
        } */
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the file path: ");

            Scanner fileScanner = new Scanner(new FileReader(scanner.nextLine()));

            while(fileScanner.hasNext()){
                String fileLine = fileScanner.nextLine();
                System.out.println(fileLine);
            }


        } catch (IOException e) {

            e.printStackTrace();
        }


    }
}
