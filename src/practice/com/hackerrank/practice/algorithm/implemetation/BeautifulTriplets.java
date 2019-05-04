package com.hackerrank.practice.algorithm.implemetation;

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulTriplets {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			int ai = a[i];
			int aj = ai + d;
			int ak = aj + d;
			if(Arrays.binarySearch(a, aj) >= 0 && Arrays.binarySearch(a, ak) >= 0) count++;
		}
		System.out.println(count);
		scan.close();
	}

}
