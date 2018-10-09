package warmup;

import java.util.Scanner;

public class TimeConversion {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        String ampm = time.substring(8, 10);      
        
        String hh = time.substring(0, 2);
        if ("PM".equalsIgnoreCase(ampm) && !"12".equalsIgnoreCase(hh)) {
            int hr = Integer.parseInt(hh);
            int tothr = hr + 12;
            hh = Integer.toString(tothr);
        } else if ("AM".equalsIgnoreCase(ampm) && "12".equalsIgnoreCase(hh)) {
            hh = "00";
        }
        
        String mm = time.substring(3, 5);
        
        String ss = time.substring(6, 8);      
        
        System.out.println(hh+":"+mm+":"+ss);
        
        in.close();
    }

}
