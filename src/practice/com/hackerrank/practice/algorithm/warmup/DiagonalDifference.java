package com.hackerrank.practice.algorithm.warmup;

import java.util.Scanner;

public class DiagonalDifference {
	
	public static void main(String[] args) {
        int first = 0; // first diagonal
        int second = 0; // second diagonal        
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int dec_a_i = n - 1;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();                
                // first diagonal
                if (a_i == a_j) {
                    first = first + a[a_i][a_j];
                }                
                // second diagonal
                if (a_j == dec_a_i) {
                    second = second + a[a_i][a_j];
                    dec_a_i--;
                }                
            }            
        }
        
        int compare = 0;
        if (first > second) {
            compare = first - second;
        } else {
            compare = second - first;
        }
        
        System.out.println(compare);
        
        in.close();
    }

}
