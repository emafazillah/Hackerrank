package sorting;

import java.io.IOException;
import java.util.Scanner;

public class Quicksort1Partition {
	
    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        int size = arr.length;
        int[] result = new int[size];
        
        int equal = arr[0];
        int[] right = initArr(size);
        int[] left = initArr(size);
        
        // Divide
        for(int i = 1; i < size; i++) {
            if(arr[i] > equal) {
                right[i] = arr[i];
            } else if(arr[i] < equal) {
                left[i] = arr[i];
            }
        }
        
        // Sort
        int idx = 0;
        // Left
        int j = 0;
        while(j < size) {
            if(left[j] > 0) {
                result[idx] = left[j];
                ++idx;
            }
            ++j;
        }
        // Equal
        result[idx] = equal;
        ++idx;
        // Right
        j = 0;
        while(j < size) {
            if(right[j] > 0) {
                result[idx] = right[j];
                ++idx;
            }
            ++j;
        }

        return result;
    }

    static int[] initArr(int size) {
        int[] result = new int[size];
        for(int i = 0; i < size; i++) {
            result[i] = 0;
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
