package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// First attempt

public class FullCountingSort {
	// Complete the countSort function below.
    static void countSort(List<List<String>> arr) {
    	// Replace first half of the collection with dash
    	for(int i = 0; i < (arr.size() / 2); i++) {
    		arr.get(i).set(1, "-");
    	}
    	
    	// Sort list
    	List<List<String>> s0 = new ArrayList<>();
    	List<List<String>> s1 = new ArrayList<>();
    	List<List<String>> s2 = new ArrayList<>();
    	List<List<String>> s3 = new ArrayList<>();
    	List<List<String>> s4 = new ArrayList<>();
    	List<List<String>> s5 = new ArrayList<>();
    	List<List<String>> s6 = new ArrayList<>();
    	List<List<String>> s7 = new ArrayList<>();
    	List<List<String>> s8 = new ArrayList<>();
    	List<List<String>> s9 = new ArrayList<>();
    	List<List<String>> s10 = new ArrayList<>();
    	List<List<String>> sorted = new ArrayList<>();
    	
    	for(int i = 0; i < arr.size(); i++) {
    		int s = Integer.parseInt(arr.get(i).get(0));
    		switch(s) {
	    		case 1:
	    			s1.add(arr.get(i));
	    			break;
	    		case 2:
	    			s2.add(arr.get(i));
	    			break;
	    		case 3:
	    			s3.add(arr.get(i));
	    			break;
	    		case 4:
	    			s4.add(arr.get(i));
	    			break;
	    		case 5:
	    			s5.add(arr.get(i));
	    			break;
	    		case 6:
	    			s6.add(arr.get(i));
	    			break;
	    		case 7:
	    			s7.add(arr.get(i));
	    			break;
	    		case 8:
	    			s8.add(arr.get(i));
	    			break;
	    		case 9:
	    			s9.add(arr.get(i));
	    			break;
	    		case 10:
	    			s10.add(arr.get(i));
	    			break;
    			default:
    				s0.add(arr.get(i));
    				break;
    		}
    	}
    	
    	sorted.addAll(s0);
    	sorted.addAll(s1);
    	sorted.addAll(s2);
    	sorted.addAll(s3);
    	sorted.addAll(s4);
    	sorted.addAll(s5);
    	sorted.addAll(s6);
    	sorted.addAll(s7);
    	sorted.addAll(s8);
    	sorted.addAll(s9);
    	sorted.addAll(s10);
    	
    	// Print result
    	String result = "";
    	for(int i = 0; i < sorted.size(); i++) {
    		result += sorted.get(i).get(1) + " ";
    	}
    	
    	System.out.println(result);
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
