package com.hackerrank.practice.algorithm.sorting;

import java.util.Scanner;

public class Quicksort2Sorting {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(scanner.next());
		}
		
		int pivot = arr[0];
		
		int[] left = new int[n];
		int[] right = new int[n];
		int[] equal = new int[n];
		
		int countLeft = 0;
		int countRight = 0;
		int countEqual = 0;
		
		// Partition
		for(int i = 0; i < n; i++) {
			if(arr[i] > pivot) {
				// right
				right[countRight] = arr[i];
				++countRight;
			} else if(arr[i] < pivot) {
				// left
				left[countLeft] = arr[i];
				++countLeft;
			} else {
				// equal
				equal[countEqual] = arr[i];
				++countEqual;
			}
		}
		
		// Order left
		// TODO RECURSIVE
				
		scanner.close();
	}
	
	static void printArr(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] > 0) {
				System.out.print(arr[j] + " ");
			}
		}
		System.out.println();
	}

}
