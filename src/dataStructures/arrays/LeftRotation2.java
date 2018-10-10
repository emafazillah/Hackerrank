package arrays;

import java.util.Scanner;

public class LeftRotation2 {
	
	// Score 20.00
	@SuppressWarnings("resource")
	public static void main (String[] args) {
		// Input
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = scan.nextInt();
		}
		// Start rotate
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			int location = (i + (n - d)) % n; 
			result[location] = arr[i];
		}
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i] + " ");
		}
	}

}
