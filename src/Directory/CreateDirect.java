
import java.io.File;
import java.util.Scanner;

//create directory use java.io.file
//for error handlin we use if-else
public class CreateDirect {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the directory pathL: ");

        File directory = new File(scanner.nextLine());//file object created

        if (!directory.exists()) {
            boolean created = directory.mkdirs();//use mkdirs() for create nested directories

            if (created) {
                System.out.println("Directory created successfull.");
            } else {
                System.out.println("Directory created failed.");
            }
        } else {
            System.out.println("already directory exsits");
        }
    }
}
