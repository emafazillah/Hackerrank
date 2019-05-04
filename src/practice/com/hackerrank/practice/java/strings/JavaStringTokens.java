package com.hackerrank.practice.java.strings;

import java.util.Scanner;

public class JavaStringTokens {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() > 400000) {
            return ;
        } else if (s.length() == 0) {
            System.out.println(0);
            return ;
        } else {
            String[] arrString = s.split("[!,?.*_'@\\ ]+");
            int len = arrString.length;
            System.out.println(len);
            for (int i = 0; i < len; i++) {
                System.out.println(arrString[i]);
            }            
        }        
        scan.close();
    }

}
