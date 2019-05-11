package com.hackerrank.practice.interviewPreparationKit.sorting;

import java.util.Scanner;

public class BubbleSort {
	
	// Complete the countSwaps function below.
    static void countSwaps(int[] a) {
    	int i = 0;
    	int countSwap = 0;
    	int size = a.length;
    	while(i < a.length - 1) {
    		if(a[i] > a[i + 1]) {
    			int temp = a[i];
    			a[i] = a[i + 1];
    			a[i + 1] = temp;
    			++countSwap;
    			i = 0;
    		} else {
    			++i;
    		}
    	}
    	
    	System.out.println("Array is sorted in " + countSwap + " swaps.");
    	System.out.println("First Element: " + a[0]);
    	System.out.println("Last Element: " + a[size - 1]);
    }
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String...strings) {
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
	}

}
