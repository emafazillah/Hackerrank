package com.hackerrank.practice.algorithm.sorting;

import java.io.IOException;
import java.util.Scanner;

public class Quicksort1Partition {
	
    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        int size = arr.length;
        
        int pivot = arr[0];
        int pIndex = size - 1;
        int temp = 0;
        
        for(int i = size - 1; i >= 1; i--) {
        	if(arr[i] >= pivot) {
        		temp = arr[i];
        		arr[i] = arr[pIndex];
        		arr[pIndex] = temp;
        		--pIndex;
        	}
        }
        
        temp = arr[pIndex];
        arr[pIndex] = pivot;
        arr[0] = temp;

        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
        	System.out.print(result[i]);

            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
            	System.out.print(" ");
            }
        }

//        bufferedWriter.newLine();

//        bufferedWriter.close();
        
        System.out.println();

        scanner.close();
    }

}
