package PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    public static void main (String [] args) {

        HashMap <String,String> phoneBook = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n Enter 1 to add an entry: " +
            "\n Enter 2 to view phone book: " + 
            "\n Enter 3 to search entry by name: " +
            "\n Enter 4 to modify entry: " +
            "\n Enter 5 to delete an entry: " +
            "\n Enter Any other number to exit...");
        }

    }
}
