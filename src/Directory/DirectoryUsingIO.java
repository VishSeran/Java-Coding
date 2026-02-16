
import java.io.File;
import java.util.Scanner;

public class DirectoryUsingIO {

    //create a directory
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

    //view content of a directory
    private static void viewContentInDirectory(String directorypath) {

        File directory = new File(directorypath);

        if (directory.exists()) {
            String[] content = directory.list();

            if (content != null) {

                System.out.println("Content of the directory in path " + directorypath);
                for (String file : content) {
                    System.out.println(file);
                }

            } else {
                System.out.println("Directory is empty!");
            }
        } else {
            System.out.println("Directory do not exists!");
        }
    }

    //Delete a directory
    private static void deleteDirectory(String directoryPath) {

        File directory = new File(directoryPath);

        if (directory.exists()) {
            boolean deleted = directory.delete();

            if (deleted) {
                System.out.println(directoryPath + " deleted successfully");
            } else {
                System.out.println("Error occured while deleting ");
            }
        } else {
            System.out.println("Directory do not exists!");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean running = true;

        while (running) {

            System.out.println("\ntype 1: Create a new directory ");
            System.out.println("type 2: View contents in directory ");
            System.out.println("type 3: Delete a directory ");
            System.out.println("type 0: Exit ");
            System.out.println("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            if(choice == 0){
                System.out.println("System is closing...");
                running = false;
                return;
            }

            switch (choice) {

                case 1:
                    System.out.println("\nEnter directory path: ");
                    String directoryPath = scanner.nextLine();
                    createDirect(directoryPath);
                    break;

                case 2:
                    System.out.println("\nEnter directory path:");
                    String Viewpath = scanner.nextLine();
                    viewContentInDirectory(Viewpath);
                    break;

                case 3:
                    System.out.println("\nEnter directory path to delete: ");
                    String Deletepath = scanner.nextLine();
                    deleteDirectory(Deletepath);
                    break;
                
                default:
                    System.out.println("Invalid input! please enter again");

            }
        }

    }
}
