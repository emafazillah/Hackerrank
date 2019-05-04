package com.hackerrank.practice.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceInAnArray {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int[] diff = new int[n - 1];
        for(int i = 0; i < n - 1; i++) {
        	diff[i] = Math.abs(a[i] - a[i + 1]);
        }
        Arrays.sort(diff);        
        System.out.println(diff[0]);
        in.close();
    }

}
