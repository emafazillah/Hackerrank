package com.hackerrank.practice.java.advanced;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new Scanner(System.in);
		System.out.println(getMd5(scanner.next()));
		scanner.close();
    }
	
	public static String getMd5(String input) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] mdByte = md.digest(input.getBytes());
		BigInteger bi = new BigInteger(1, mdByte);
		String hashText = bi.toString(16);
		while (hashText.length() < 32) {
			hashText = "0" + hashText;
		}
		return hashText;
	}

}
