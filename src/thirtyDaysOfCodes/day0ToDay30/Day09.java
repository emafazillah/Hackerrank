package day0ToDay30;

import java.util.Scanner;

public class Day09 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();        
        int result = Factorial(input);
        System.out.println(result);
        scan.close();
    }
    
    private static int Factorial(int n) {
        if(n == 0) { 
            return 1;
        } else { 
            return (n * Factorial(n-1));
        }
    }

}
