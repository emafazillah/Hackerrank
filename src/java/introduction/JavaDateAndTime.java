package introduction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class JavaDateAndTime {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
                
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        DateFormat df = new SimpleDateFormat("E");
        String test = df.format(cal.getTime());
        String getday = "";       
        switch (test) {
            case "Mon":
                getday = "MONDAY";
                break;
            case "Tue":
                getday = "TUESDAY";
                break;
            case "Wed":
                getday = "WEDNESDAY";
                break;
            case "Thu":
                getday = "THURSDAY";
                break;
            case "Fri":
                getday = "FRIDAY";
                break;
            case "Sat":
                getday = "SATURDAY";
                break;
            case "Sun":
                getday = "SUNDAY";
                break;
            default:
                getday = "";
                break;
        }
            
        System.out.println(getday);
        in.close();
    }

}
