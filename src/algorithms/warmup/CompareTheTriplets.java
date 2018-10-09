package warmup;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        if ((a0 > 100) || (a1 > 100) || (a2 > 100) || (b0 > 100) || (b1 > 100) || (b2 > 100)) {
            System.out.println("must equal or less than 100");
        } else if ((a0 < 1) || (a1 < 1) || (a2 < 1) || (b0 < 1) || (b1 < 1) || (b2 < 1)) {
            System.out.println("must equal or greater than 1");
        } else {
            int alice = 0;
            int bob = 0;
                
            if (a0 > b0) {
                alice++;
            } 
            if (b0 > a0) {
                bob++;
            }
            if (a1 > b1) {
                alice++;
            }
            if (b1 > a1) {
                bob++;
            }
            if (a2 > b2) {
                alice++;
            }
            if (b2 > a2) {
                bob++;
            }
            
            //System.out.println("alice==="+alice);
            //System.out.println("bob==="+bob);
            
            System.out.println(alice+" "+bob);
        }
        in.close();
	}
	
}
