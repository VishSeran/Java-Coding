
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDifference {

    public static String getDiffer(LocalDate date1 , LocalDate date2){


        Period period = date1.until(date2);

        String difference = "The difference is: \n";

        if(period.getYears() != 0 ){
            difference = difference + period.getYears() + " years\n";
        }

        if(period.getMonths() != 0){
            difference = difference + period.getMonths() + " months\n";
        }

        if(period.getDays() != 0 ){
            difference = difference + period.getDays() + " days\n";
        }

        return difference;
    }

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        LocalDate todayDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("\nToday date is " + todayDate.format(formatter));

        System.out.println("Input the date in dd/MM/yyyy format: ");
        String rawDate = scanner.nextLine();

        try {
            LocalDate givenDate = LocalDate.parse(rawDate, formatter);

            System.out.println("Entered date is " + givenDate.format(formatter));


            if(givenDate.isEqual(todayDate)){
                System.out.println("Both dates are the same");
            }

            if(givenDate.isBefore(todayDate)){
               System.out.println(getDiffer(givenDate, todayDate)); 
            }else{
                System.out.println(getDiffer(todayDate, givenDate));
            }
        } catch (DateTimeException e) {
            System.out.println("Invalid input!" + e.getMessage());
        }
    }
    
}
