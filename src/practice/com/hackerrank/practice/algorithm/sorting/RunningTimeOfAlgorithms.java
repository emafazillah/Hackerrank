package com.hackerrank.practice.algorithm.sorting;

import java.io.IOException;
import java.util.Scanner;

public class RunningTimeOfAlgorithms {
	
    // Complete the runningTime function below.
    static int runningTime(int[] arr) {
    	int result = 0;
    	
    	for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int j = i - 1;
            while((j > 0 || j == 0) && arr[j] > value){
                arr[j + 1] = arr[j];
                j = j - 1;
                ++result;
            }
            arr[j + 1] = value;
        }
    	
    	return result;
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

        int result = runningTime(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();
        
        System.out.println(result);

        scanner.close();
    }

}
