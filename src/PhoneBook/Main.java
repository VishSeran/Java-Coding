package PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            HashMap<String, String> phoneBook = new HashMap<>();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n Enter 1 to add an entry: "
                        + "\n Enter 2 to view phone book: "
                        + "\n Enter 3 to search entry by name: " 
                        + "\n Enter 4 to delete an entry: "
                        + "\n Enter Any other number to exit...");

                String userSelection = scanner.nextLine();

                if (userSelection.equals("1")) {

                    System.out.println("Create an Entry");
                    System.out.println("===============\n");

                    System.out.println("Enter a name: ");
                    String name = scanner.nextLine();

                    if (!PhoneBookHashMap.isNameValid(name)) {
                        System.out.println("Enter a valid name!");

                    } else if (phoneBook.containsKey(name)) {
                        System.out.println("\nThe name is already exists!");
                        
                    } else {
                        System.err.println("\n Enter phone number");
                        String number = scanner.nextLine();

                        if (!PhoneBookHashMap.isNumberValid(number)) {
                            System.err.println("\n Enter a valid phone number!");
                        } else {
                            System.out.println("\nEntry adding...");
                            phoneBook.put(name, number);

                            System.out.println("Entry successfully added");
                        }
                    }
                } else if(userSelection.equals("2")){
                    System.out.println("Phone book is loading!\n");

                    for(String key: phoneBook.keySet()){
                        System.out.println("\nname: " + key + " phone No: "+ phoneBook.get(key));
                    }

                    System.out.println("\n entries over \n");
                }
                else if(userSelection.equals("3")){
                    System.out.println("\nHere you go!");

                    System.out.println("\nPlease type the name you want tp search: ");
                    String nameSearch = scanner.nextLine();
                    System.out.println("\nSearching....");
                    
                    if(phoneBook.containsKey(nameSearch)){
                        System.err.println("Name found!");
                        System.err.println("\n Name: " + nameSearch + " Phone no: " + phoneBook.get(nameSearch)+"\n");
                    }else{
                        System.out.println("Name not found");
                        
                    }
                }else if(userSelection.equals("4")){
                    System.out.println("\nEnter the name: ");
                    String nameDelete = scanner.nextLine();

                    if(phoneBook.containsKey(nameDelete)){
                        System.out.println("Name found!");
                        System.out.println("\n Are you sure?");
                        String answer = scanner.nextLine();

                        if(answer.equalsIgnoreCase("yes")){
                            phoneBook.remove(nameDelete);
                            System.out.println("Entry delete successfull!");
                        }else if (answer.equalsIgnoreCase("no")){
                            break;
                        }else {
                            System.out.println("Invalid Input!");
                        }
                    }else {
                        System.out.println("\nName not found!");
                    }
                }else{
                    break;
                }
                

            }
        } catch (Exception e) {
        }

    }
}
