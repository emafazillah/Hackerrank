package arrays;

import java.util.Scanner;

public class LeftRotation {
	
	// Score 15.56. Time out at Test Case #8 Test Case #9 
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
		for(int i = 1; i <= d; i++){ // Rotation
			int count = 0;
			for(int j = 0; j < n; j++){ // Array item		
				if( (j + i) >= n ) {
					result[j] = arr[count];
					count++;
				} else {
					result[j] = arr[j + i];
				}
			}
		}
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i] + " ");
		}
	}

}
