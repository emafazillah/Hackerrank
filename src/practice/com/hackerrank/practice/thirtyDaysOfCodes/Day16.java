package com.hackerrank.practice.thirtyDaysOfCodes;

import java.util.Scanner;

public class Day16 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
                
        try {
            int i = Integer.parseInt(S);
            System.out.println(i);
        } catch (Exception ex) {
            System.out.println("Bad String");
        }
        in.close();
    }

}
