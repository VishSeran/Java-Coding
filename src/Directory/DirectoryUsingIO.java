
import java.io.File;
import java.util.Scanner;

public class DirectoryUsingIO {

    private static void createDirect(String directoryPath) {

        System.out.println("Please enter the path of the directory: ");

        File directory = new File(directoryPath);

        if (!directory.exists()) {
            boolean created = directory.mkdirs();

            if (created) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("Directory created failed!");
            }
        } else {
            System.out.println("Directory already exsits!");
        }
    }

    private static void viewContentInDirectory(String directorypath){
        

        File directory = new File(directorypath);

        if(directory.exists()){
            String[] content = directory.list();

            if(content != null){

                System.out.println("Content of the directory in path "+ directorypath);
                for(String file: content){
                    System.out.println(file);
                }

            }else{
                System.out.println("Directory is empty!");
            }
        }else{
            System.out.println("Directory do not exists!");
        }



    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("type 1: Create a new directory ");
        System.out.println("type 2: View contents in directory ");
        System.out.println("type 3: delete a directory ");
        System.out.println("Enter your choice: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {

            case 1:
                System.out.println("\nEnter directory path: ");
                String directoryPath = scanner.nextLine();
                createDirect(directoryPath);
                break;
            
            case 2:
                System.out.println("\nEnter directory path:" );
                String path = scanner.nextLine();
                viewContentInDirectory(path);
                break;
                   
        }
    }
}
