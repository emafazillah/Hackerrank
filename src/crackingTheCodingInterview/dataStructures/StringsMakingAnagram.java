package dataStructures;

import java.util.Scanner;

public class StringsMakingAnagram {

	public static int numberNeeded(String first, String second) {					
		int[] count = new int[26]; // 26 --> count every a to z
		// First
		for(char charFirst : first.toCharArray()) {
			int iFirst = Character.getNumericValue(charFirst);
			count[iFirst - 10]++; // 10 --> a
		}
		// Second
		for(char charSecond : second.toCharArray()) {
			int iSecond = Character.getNumericValue(charSecond);
			count[iSecond - 10]--; // 10 --> a
		}
		// count remove
		int output = 0;	
		for(int i = 0; i < 26; i++) {
			output += Math.abs(count[i]);			
		}
		return output;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

}
