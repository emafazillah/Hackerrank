package warmup;

import java.util.Scanner;

public class SimpleArraySum {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1 = scan.nextInt();
        
        int count = 0;
        int total = 0;
        while (scan.hasNext()) {
            count++;
            int sum = scan.nextInt();
            total = total + sum;
            //System.out.println(count+"==="+sum);
            //System.out.println("total==="+total);
        }
        
        if (input1 == count) {
            //System.out.println("same");
            System.out.println(total);
        } else {
            System.out.println("not same");
        }
        
        scan.close();
    }

}
