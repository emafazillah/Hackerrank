package sorting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingSort1 {
	
	// Complete the countingSort function below.
    static int[] countingSort(int[] arr) {
    	int n = arr.length;
    	
    	int[] count = new int[n];
    	
    	for (int i = 0; i < n; i++) {
    		if (i == arr[i]) {
    			count[i]++;
    		}
    	}
    	
    	int[] sortedList = new int[n];
    	
    	int idx = 0;
        
        for (int i = 0; i < n; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    sortedList[idx] = i;
                    idx++;
                }
            }
        }
    	
    	return null;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void test(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = countingSort(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(arrItems[i]);
        }

        int[] result = countingSort(arr);

        for (int i = 0; i < result.length; i++) {
        	System.out.println(String.valueOf(result[i]));

            if (i != result.length - 1) {
            	System.out.println(" ");
            }
        }

        scanner.close();
    }

}
