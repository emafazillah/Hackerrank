package implemetation;

import java.util.Scanner;

public class FindDigits {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String[] N = new String[T];
        for(int i = 0; i < T; i++) {
        	N[i] = scan.next();
        }
        for(int i = 0; i < T; i++) {
        	int count = 0;
        	int number = Integer.parseInt(N[i]);
        	char[] arr = N[i].toCharArray();
        	for(int j = 0; j < arr.length; j++) {
        		int digit = Integer.parseInt(Character.toString(arr[j]));        		
        		if((digit != 0) && (number % digit == 0)) count++; 
        	}
        	System.out.println(count);
        }
        scan.close();
    }

}
