package com.hackerrank.practice.java.strings;

import java.util.Scanner;

public class JavaStringReverse {
	
	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] arr = A.toCharArray();
        int arrlen = arr.length;
        int countcheck = arrlen;
        if (((arrlen % 2) == 1) || ((arrlen % 2) == 0)) {
            int arrlendivby2 = arrlen / 2;
            countcheck = arrlendivby2;
            int decrval = 1;
            for (int i = 0; i < arrlendivby2; i++) {
                String firsthalf = Character.toString(arr[i]);
                String secondhalf = Character.toString(arr[arrlen-decrval]);
                if (firsthalf.equalsIgnoreCase(secondhalf)) {
                    countcheck--;   
                }
                decrval++;
            }
        }
        
        if (countcheck > 0) {
            System.out.println("No");    
        } else {
            System.out.println("Yes");
        }
        
        sc.close();
    }

}
