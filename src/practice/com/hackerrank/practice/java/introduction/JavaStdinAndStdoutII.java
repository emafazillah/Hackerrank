package com.hackerrank.practice.java.introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutII {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();        
        String s = scan.nextLine();
        while (scan.hasNext()) {
            s = s + scan.nextLine();
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }

}
