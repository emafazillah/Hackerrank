package com.hackerrank.practice.java.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new Scanner(System.in);
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] bytes = md.digest(scanner.next().getBytes());
		for (byte b : bytes) {
			System.out.printf("%02x", b);
		}
		scanner.close();
    }

}
