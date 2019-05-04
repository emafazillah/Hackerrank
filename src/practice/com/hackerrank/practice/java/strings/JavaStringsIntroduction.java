package com.hackerrank.practice.java.strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringsIntroduction {
	
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int lenA = A.length();
        int lenB = B.length();
        System.out.println((lenA + lenB));
        
        String[] arrstr = new String[2];
        arrstr[0] = A;
        arrstr[1] = B;
        Arrays.sort(arrstr);
        if (A.equals(arrstr[0])) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
        char[] charA = A.toCharArray();
        String newA = "";
        for (int i = 0; i < charA.length; i++) {
            if (i == 0) {
                newA = (Character.toString(charA[i])).toUpperCase();
            } else {
                newA = newA + Character.toString(charA[i]);
            }            
        }
        
        char[] charB = B.toCharArray();
        String newB = "";
        for (int i = 0; i < charB.length; i++) {
            if (i == 0) {
                newB = (Character.toString(charB[i])).toUpperCase();
            } else {
                newB = newB + Character.toString(charB[i]);
            }            
        }
        newB = newB.trim();
        
        System.out.println(newA + " " + newB);
        sc.close();
        
    }

}
