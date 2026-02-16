import java.io.File;
import java.util.Scanner;

public class DirectoryUsingIO {
    public static void main(String[] args) {
        
        //create directory using java.io.file

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the path of the directory: ");

        File directory = new File(scanner.nextLine());

        if(!directory.exists()){
            boolean created = directory.mkdirs();

            if(created){
                System.out.println("Directory created successfully");
            }else{
                System.out.println("Directory created failed!");
            }
        }else{
            System.out.println("Directory already exsits!");
        }

    }
}
