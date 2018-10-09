package day0ToDay30;

import java.util.Scanner;

public class Day01 {
	
	public static void main(String[] args) {		
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
		/* Declare second integer, double, and String variables. */
        int i2 = 0;
        double d2 = 0.0;
        String s2 = "";

        /* Read and save an integer, double, and String to your variables.*/
        i2 = i + scan.nextInt();
        d2 = d + scan.nextDouble();
        while (scan.hasNext()) {
            s2 = s2 + scan.next() + " ";
        }

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d2);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + s2);
        
        scan.close();
	}

}
