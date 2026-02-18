
import java.time.LocalDate;
import java.time.Period;

public class DateDifference {

    public static String getDiffer(LocalDate date1 , LocalDate date2){


        Period period = date1.until(date2);

        String difference = "The difference is: ";

        if(period.getYears() != 0 ){
            difference = difference + period.getYears() + "years";
        }

        if(period.getMonths() != 0){
            difference = difference + period.getMonths() + "months";
        }

        if(period.getDays() != 0 ){
            difference = difference + period.getDays() + "days";
        }

        return difference;
    }

    public static void main(String []args){

    }
    
}
