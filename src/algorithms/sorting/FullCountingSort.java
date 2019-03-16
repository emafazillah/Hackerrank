package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 2nd Attempt

public class FullCountingSort {
	// Complete the countSort function below.
    static void countSort(List<List<String>> arr) {
    	// Replace first half of the collection with dash
    	for(int i = 0; i < (arr.size() / 2); i++) {
    		arr.get(i).set(1, "-");
    	}
    	
    	// Sort list
    	StringBuffer[] sorted = new StringBuffer[100];
    	for(int i = 0; i < 100; i++) {
    		sorted[i] = new StringBuffer();
    	}
    	
    	for(int i = 0; i < arr.size(); i++) {
    		int x = Integer.parseInt(arr.get(i).get(0));
    		String s = arr.get(i).get(1) + " ";
    		sorted[x] = sorted[x].append(s);
    	}
    	
    	// Print output
    	for(int i = 0; i < arr.size(); i++) {
    		System.out.print(sorted[i]);
    	}
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")));
        }

        countSort(arr);

        bufferedReader.close();
    }
}
