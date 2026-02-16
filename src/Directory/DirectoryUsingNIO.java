
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DirectoryUsingNIO {

    private static void createDirect(String directoryPath) {

        Path path = Paths.get(directoryPath);

        try {
            Path creatDir = Files.createDirectory(path);
            System.out.println("Directory created successfully! " + creatDir.toString());
        } catch (IOException e) {
            System.out.println("Invalid input");
        }
    }

    private static void viewDirectory(String directoryPath) {

        Path path = Paths.get(directoryPath);

        try {
            Files.list(path).forEach(System.out::print);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteDirect(String directoryPath){
        Path path = Paths.get(directoryPath);

        try {
            Files.delete(path);
            System.out.println("directory deleted "+ path);
        } catch (IOException e) {
            e.printStackTrace();
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

            if(choice ==0){
                running = false;
                System.out.println("System is closing...");
                return;
            }

            switch (choice) {
                case 1:
                    System.out.println("Entre the directory path: ");
                    String createPath = scanner.nextLine();
                    createDirect(createPath);
                    break;

                case 2:
                    System.out.println("Entre the directory path: ");
                    String viewPath = scanner.nextLine();
                    viewDirectory(viewPath);
                    break;

                case 3:
                    System.out.println("Entre the directory path: ");
                    String deletePath = scanner.nextLine();
                    deleteDirect(deletePath);
                    break;
            }
        }

    }
}
