
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;



public class ZoneTime {
    

    //ZoneId we can get relevant zones like America/New_York.
    public static void main(String []args){
        /* ZoneId timeZone = ZoneId.of("America/New_York");
        System.out.println("Zone id of the timeZone: "+ timeZone);

        ZonedDateTime zoneDateTiem = ZonedDateTime.now(timeZone); */

        ZonedDateTime meetingTimeUTC = ZonedDateTime.parse("2024-12-30T15:00:00Z");

        String pattern = " YYYY-MM-D--- HH:mm:ss";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        

        String [] zones = {"America/New_York", "Europe/London", "Asia/Kolkata" , "Australia/Sydney"};

        for(String zone : zones){
            ZonedDateTime zoneTime = meetingTimeUTC.withZoneSameInstant(ZoneId.of(zone));
            System.out.println("Meeting on the time in time zone: " + zone + " at: " + zoneTime.format(formatter));
        }
    }
}
