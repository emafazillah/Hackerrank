package com.hackerrank.practice.algorithm.implemetation;

import java.util.Scanner;

public class UtopianTree {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();        
        int[] N = new int[T];
        for(int i = 0; i < T; i++) {
        	N[i] = scan.nextInt();
        }
        for(int i = 0; i < T; i++) {
    		int height = 1;
    		int cycle = N[i];
    		for(int j = 0; j < cycle; j++) {
    			if(j % 2 > 0)  
    				height++; // Summer	
    			else 
    				height = height * 2; // Spring
    		}    		
    		System.out.println(height);
    	}
        scan.close();
    }

}
