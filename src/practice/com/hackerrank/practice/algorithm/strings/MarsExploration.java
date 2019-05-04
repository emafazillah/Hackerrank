package com.hackerrank.practice.algorithm.strings;

import java.util.Scanner;

public class MarsExploration {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        
        char[] charS = S.toCharArray();
        int count = 0;
        String test = "";
        for (int i = 0; i < charS.length; i++) {
            test = test + Character.toString(charS[i]);
            if (test.length() == 1) {
                if (!"S".equals(test)) {
                    count++;
                }
            } 
            if (test.length() == 2) {
                if (!"O".equals(test.substring(1))) {
                    count++;
                }
            } 
            if (test.length() == 3) {
                if (!"S".equals(test.substring(2))) {
                    count++;   
                }
                test = "";
            }
        }
        System.out.println(count);
    }

}
