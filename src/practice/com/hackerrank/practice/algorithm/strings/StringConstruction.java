package com.hackerrank.practice.algorithm.strings;

import java.util.Scanner;

public class StringConstruction {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            System.out.println(s.chars().distinct().count());
        }
        in.close();
    }

}
