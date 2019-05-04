package com.hackerrank.practice.algorithm.warmup;

import java.util.Scanner;

public class PlusMinus {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double countpositive = 0;
        double countnegative = 0;
        double countzero = 0;
        double pos = 0;
        double neg = 0;
        double zer = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
                        
            if (arr[arr_i] > 0) {
                
                // positive number
                countpositive++;
                
            } else if (arr[arr_i] < 0) {
                
                // negative number
                countnegative++;
                
            } else {
                
                // zero
                countzero++;
                
            }            
            
        }
        
        pos = countpositive / n;
        neg = countnegative / n;
        zer = countzero / n;

        System.out.println(String.format("%.6f",pos));            
        System.out.println(String.format("%.6f",neg));
        System.out.println(String.format("%.6f",zer));        
        
        in.close();
    }

}
