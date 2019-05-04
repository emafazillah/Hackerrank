package com.hackerrank.practice.java.strings;

import java.util.Scanner;

public class JavaRegex2 {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int testCases = Integer.parseInt(scanner.nextLine());
		
		while(testCases > 0) {
			String result = "";
			String[] input = scanner.nextLine().split(" ");
			for (int i = 0; i < input.length; i++) {
				if (i == 0) {
					result += input[i] + " ";
				} else {
					if (!isMatched(result, input[i])) {
						result += input[i] + " ";
					}
				}
			}
			
			System.out.println(result.trim());
			
			testCases--;
		}
		
		scanner.close();
	}
	
	private static Boolean isMatched(String input, String pattern) {
		return input.matches("(?i:.* " + pattern + ".*)");
	}

}
