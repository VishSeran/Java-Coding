
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadeFileUseFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path: ");

        Path path = Paths.get(scanner.nextLine());

        try {
            String content = Files.readString(path);

            System.out.println("Content: " + content);

        } catch (IOException e) {

            System.out.println("Invalid input");
        }

    }
}
