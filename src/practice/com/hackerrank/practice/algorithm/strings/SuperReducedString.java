package com.hackerrank.practice.algorithm.strings;

import java.util.Scanner;

public class SuperReducedString {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();
        
        char[] chararr = input.toCharArray();
        String a = "";
        String result = "";
        for (int i = 0; i < chararr.length; i++) {
            a = Character.toString(chararr[i]);   
            String check = "";
            if (result.length() > 0) {
                check = result.substring(result.length() - 1);
            }
            if (!check.equalsIgnoreCase(a)) {
                result = result + a;
            } else {
                if (result.length() > 0) {
                    result = result.substring(0, result.length() - 1);
                }
            }
        }
        
        if ("".equalsIgnoreCase(result)) {
            System.out.println("Empty String");
        } else {
            System.out.println(result);   
        }
    }

}
