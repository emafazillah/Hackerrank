package com.hackerrank.practice.algorithm.implemetation;

import java.util.Scanner;

public class LibraryFine {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dd_actual = leadingZeroes(scan.next(), 2);
        String mm_actual = leadingZeroes(scan.next(), 2);
        String yy_actual = leadingZeroes(scan.next(), 4);
        String dd_expected = leadingZeroes(scan.next(), 2);
        String mm_expected = leadingZeroes(scan.next(), 2);
        String yy_expected = leadingZeroes(scan.next(), 4);
        int actual = Integer.parseInt(yy_actual + mm_actual + dd_actual);
        int expected = Integer.parseInt(yy_expected + mm_expected + dd_expected);
        int fine = 0;
        if(actual > expected) {
            if(Math.abs(Integer.parseInt(yy_expected) - Integer.parseInt(yy_actual)) > 0) {
                fine = 10000;
            } else {
                if(Math.abs(Integer.parseInt(mm_expected) - Integer.parseInt(mm_actual)) > 1) {
                    fine = Math.abs(Integer.parseInt(mm_expected) - Integer.parseInt(mm_actual)) * 500;
                } else {
                    fine = Math.abs(Integer.parseInt(dd_expected) - Integer.parseInt(dd_actual)) * 15;
                }
            }
        }
        System.out.println(fine);
        scan.close();
    }
    
    static String leadingZeroes(String input, int max_length) {
        String output = input;
        if(input.length() < max_length) {
            int count = 0;
            while(count < Math.abs(max_length - input.length())) {
                output = "0" + output;
                count++;
            }
        }
        return output;
    }

}
