package com.hackerrank.practice.java.introduction;

import java.util.Scanner;

public class JavaDatatypes {

	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127)
					System.out.println("* byte");
				if (x >= -32768 && x <= 32767)
					System.out.println("* short");
				if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
					System.out.println("* int");
				if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
					System.out.println("* long");

			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
		
		sc.close();
	}

}
