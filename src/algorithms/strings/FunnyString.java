package strings;

import java.util.Scanner;

public class FunnyString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n-- > 0) {
			String input = scan.next();
			char[] arr = input.toCharArray();
			int fwd = arr.length - 2;
			int rvs = arr.length - 1;
			int count = 0;
			for(int i = 0; i < fwd; i++) {
				int S = Math.abs(Character.getNumericValue(arr[i]) - Character.getNumericValue(arr[i + 1]));				
				int R = Math.abs(Character.getNumericValue(arr[rvs - i]) - Character.getNumericValue(arr[rvs - i - 1]));
				if(S != R) count++; 
			}
			String result = (count == 0) ? "Funny" : "Not Funny";
			System.out.println(result);
		}
		scan.close();
	}

}
