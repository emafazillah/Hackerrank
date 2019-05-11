package com.hackerrank.practice.interviewPreparationKit.arrays;

import java.util.Scanner;

public class ArraysLeftRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		int[] output = new int[n];
		for (int i = 0; i < n; i++) {
			int location = (i + (n - k)) % n; // Formula of left-rotation
			output[location] = a[i];
		}
		return output;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // no. of integers
		int k = in.nextInt(); // no. of rotation
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();

	}

}
