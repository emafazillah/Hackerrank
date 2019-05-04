package com.hackerrank.practice.algorithm.implemetation;

import java.util.Scanner;

public class ViralAdvertising {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 5;
        int result = 0;
        for(int i = 0; i < n; i++) {
        	int floor = Math.floorDiv(m, 2);
        	result += floor;
        	m = floor * 3;
        }
        System.out.println(result);
        scan.close();
    }

}
