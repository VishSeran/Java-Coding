
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class DateTimePrinter {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the date format do you want: ");
        System.out.println("dd for date, \n" +
                "M for month, MM for zero-padded month, MMM for abbreviated month, MMMM for full name, \n" +
                "yy or yyyy for year");

        String format = scanner.nextLine().toUpperCase();

        LocalDate todayDate =  LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        System.out.println("The formatted date of today: " + todayDate.format(formatter));

        //Local time retreiver

        System.out.println("\n\nEnter the format you would like to print the time in\n" +
                "H for Hour of day (0-23), HH for Zero-padded hour of day (00-23), \n" +
                "h for Hour of am/pm (1-12), hh for Zero-padded hour of am/pm (01-12) \n" +
                "m for Minute of hour (0-59)\n" +
                "mm for Zero-padded minute of hour (00-59)\n" +
                "s for Second of minute (0-59), ss for Zero-padded second of minute (00-59)");

        String formatTime = scanner.nextLine();

        LocalTime timeNow = LocalTime.now();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(formatTime);

        System.out.println("Formatted time: " + timeNow.format(timeFormatter));

        System.out.println("would you like to show Date and Time both? (y/n): ");
        String answer = scanner.nextLine();

        if(answer.equalsIgnoreCase("y")){

            LocalDateTime dateTime = LocalDateTime.now();

            System.out.println("Enter the Date and Time format: ");
            String dateTimeFormat = scanner.nextLine();

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimeFormat);

            System.out.println("Local date and time is "+ dateTime.format(dateTimeFormatter));

        }
    }
}
