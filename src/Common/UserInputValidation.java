package Common;


import java.util.Scanner;

public class UserInputValidation {

   

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            float number = Float.parseFloat(scanner.nextLine());
            System.out.println("The number you entered: " + number);
        } catch (NumberFormatException e) {
            System.err.println("Please enter a valid number!");
        }finally{
            scanner.close();//efficient resource management 
            System.out.println("Process over");
        }
    }
}
