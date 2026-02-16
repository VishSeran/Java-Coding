
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

            switch (choice) {
                case 1:
                    System.out.println("Entre the directory path: ");
                    String path = scanner.nextLine();
                    createDirect(path);
                    break;
            }
        }

    }
}
