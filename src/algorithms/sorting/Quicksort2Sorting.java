package sorting;

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
		
		// Print partition (left)
		int[] subLeft = new int[n];
		for(int i = 1; i < left.length; i++) {
			if(left[i] > 0 && left[i] < left[i - 1]) {
				subLeft[i] = left[i - 1];
				subLeft[i - 1] = left[i];
				printArr(subLeft);
				left[i - 1] = subLeft[i - 1];
				left[i] = subLeft[i];
			}
		}
		
		printArr(left);
		
		// Print partition (right)
		int[] subRight = new int[n];
		for(int i = 1; i < right.length; i++) {
			if(right[i] > 0 && right[i] < right[i - 1]) {
				subRight[i] = right[i - 1];
				subRight[i - 1] = right[i];
				printArr(subRight);
				right[i - 1] = subRight[i - 1];
				right[i] = subRight[i];
			}
		}
		
		printArr(right);
		
		// Merge
		int[] result = new int[n];
		int countResult = 0;
		
		// left
		int count = 0;
		while(countLeft > 0) {
			result[countResult] = left[count];
			count++;
			countLeft--;
			countResult++;
		}
		
		// equal
		count = 0;
		while(countEqual > 0) {
			result[countResult] = equal[count];
			count++;
			countEqual--;
			countResult++;
		}
		
		// right
		count = 0;
		while(countRight > 0) {
			result[countResult] = right[count];
			count++;
			countRight--;
			countResult++;
		}
		
		printArr(result);
		
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
