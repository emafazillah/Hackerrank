package com.hackerrank.practice.algorithm.warmup;

import java.util.Scanner;

public class Staircase {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dec_n = n;
        String hashh = ""; 
        String result = "";
        for (int i = 0; i < n; i++) {            
            
            String space = "";
            dec_n--;
            for (int j = 0; j < dec_n; j++) {
                space = space + " ";
            }
            
            hashh = hashh + "#";
            result = space + hashh;
            System.out.println(result);
        }        
        
        in.close();
    }

}
