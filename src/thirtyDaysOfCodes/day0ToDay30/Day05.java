package day0ToDay30;

import java.util.Scanner;

public class Day05 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(Integer.toString(n) + " x " + i + " = " + Integer.toString(result));
        }
        in.close();
    }

}
