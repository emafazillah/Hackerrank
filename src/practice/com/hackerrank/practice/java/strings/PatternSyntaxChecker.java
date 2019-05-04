package com.hackerrank.practice.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			try {
				Pattern p = Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException pe) {
				System.out.println("Invalid");
			}
		}
		in.close();
	}

}
