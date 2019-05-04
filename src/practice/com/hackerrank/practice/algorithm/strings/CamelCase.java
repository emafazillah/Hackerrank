package com.hackerrank.practice.algorithm.strings;

import java.util.Scanner;

public class CamelCase {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        char[] letter = s.toCharArray();
        int count = 0;
        String result = "";
        for (int i = 0;  i < letter.length; i++) {
            if (i == 0) {
                result = Character.toString(letter[i]);
                count++;
            } else {
                String check = Character.toString(letter[i]);
                if (check.equals(check.toUpperCase())) {
                    result = Character.toString(letter[i]);
                    count++;
                } else {
                    result = result + Character.toString(letter[i]);
                }
            }
        }
        System.out.println(count);
        in.close();
    }

}
