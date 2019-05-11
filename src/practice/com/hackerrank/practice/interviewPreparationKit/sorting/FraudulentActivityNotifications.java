package com.hackerrank.practice.interviewPreparationKit.sorting;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


/**
 * 
 * @author emafazillah
 * TIMED-OUT
 *
 */
public class FraudulentActivityNotifications {
	
	// Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
    	
		int countNotification = 0;
    	int offset = 0;
    	while((d + offset) < expenditure.length) {
    		// Create list to calculate median later
    		int[] list = new int[d];
    		
    		// Store expenditure value, expenditureValue
    		int expenditureValue = expenditure[d + offset];
    		
    		int j = 0;
			while(j < d) {
				list[j] = expenditure[offset + j];
				++j;
			}
			
			// Sort list
			//Collections.sort(list); // --> culprit
			int[] sortedList = countingSort(list);
			
			
			// Calculate median from sorted list
			double med = calculateMedian(sortedList);
			
			// Send notification if expenditureValue equal or greater than 2 x median
			if(expenditureValue >= (2 * med)) {
				++countNotification;
			}
			
			// increase offset
			++offset;
    	}

    	return countNotification;
    }
    
    private static int[] countingSort(int[] arr) {
    	int[] result = new int[arr.length];
    	
    	int max = Arrays.stream(arr).max().getAsInt();
    	int min = Arrays.stream(arr).min().getAsInt();
    	
    	// Step 1
    	// Map number in arr arrays and count of the number
    	// Map key = number in arr arrays, map value = number's count
    	// Length of the map = max - min
    	Map<Integer, Integer> map = new TreeMap<>();
    	int i = min;
    	while(i < max + 1) {
    		// Count how many number in the array
    		int j = 0;
    		int count = 0;
    		while(j < arr.length) {
    			if(arr[j] == i) {
    				++count;
    			}
    			++j;
    		}
    		
    		// Put the number and the count into the map
    		map.put(i, count);
    		
    		++i;
    	}
    	
    	// Step 2
    	// Rearrange index of the numbers of the array according to map
    	// Offset to insert into new array, result
    	int offset = 0;
    	for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
    		if(entry.getValue() > 0) {
    			int j = 0;
    			while(j < entry.getValue()) {
    				result[offset] = entry.getKey();
    				++offset;
    				++j;
    			}
    		}
    	}
    	
    	return result;
    }
    
    private static double calculateMedian(int[] arr) {
    	double med = 0D;
		double pos1 = Math.floor((arr.length - 1) / 2.0);
		double pos2 = Math.ceil((arr.length - 1) / 2.0);
		if(pos1 == pos2) {
			med = arr[(int) pos1];
		} else {
			med = (arr[(int) pos1] + arr[(int) pos2]) / 2.0;
		}
		
		return med;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        
        System.out.println(result);

        scanner.close();
    }

}
