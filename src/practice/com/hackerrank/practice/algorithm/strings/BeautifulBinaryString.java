package com.hackerrank.practice.algorithm.strings;

import java.util.Scanner;

public class BeautifulBinaryString {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        
        char[] charB = B.toCharArray();
        int count = 0;
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + Character.toString(charB[i]);
            //System.out.println(i + "===" + result);
            if (result.length() == 1) {
                if ("1".equalsIgnoreCase(result)) {
                    result = ""; 
                }
            }
            if (result.length() == 2) {
                if (!"01".equalsIgnoreCase(result)) {
                    result = "0"; 
                }
            }
            if (result.length() == 3) {
                if ("010".equalsIgnoreCase(result)) {
                    count++;
                    //System.out.println(count);
                }
                result = ""; 
            }
        }
        System.out.println(count);
        in.close();
    }

}
