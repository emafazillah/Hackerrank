package warmup;

import java.util.Scanner;

public class AVeryBigSum {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int input1 = scan.nextInt();
        
        if ((input1 < 1) || (input1 > 100)) {
            System.out.println("input1 must be between 1 to 100");
        } else {
            
            int count = 0;
            int errcount = 0;
            long total = 0;
            while (scan.hasNext()) {
                count++;
                
                long lnginput = scan.nextLong();
                if ((lnginput < Integer.MIN_VALUE) || (lnginput > Integer.MAX_VALUE)) {
                    errcount++;
                }
                
                total = total + lnginput;
            }
            
            if ((count == input1) && (errcount == 0)) {
                System.out.println(total);
            } else {                
                System.out.println("got error");
            }
        }
        
        scan.close();
    }

}
