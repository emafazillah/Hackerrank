package sorting;

import java.util.Scanner;

public class InsertionSortPart2 {
	
	// Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
    	for (int i = 0; i < n; i++) {
    		int current = arr[i];
    		if (i > 0) {
    			int j = i;
    			while(j > 0){
    				if (arr[j - 1] > current) {
    					arr[j] = arr[j - 1];
    					arr[j - 1] = current;
    					--j;
    				} else {
    					break;
    				}
    			}
    			
    			printInLine(n, arr);
    		}
    	}
    }
    
    static void printInLine(int n, int[] arr) {
    	for (int j = 0; j < n; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }

}
