package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FullCountingSort {

    public static void main(String[] args) throws IOException {
    	StringBuffer[] sorted = new StringBuffer[100];
    	for(int i = 0; i < 100; i++) {
    		sorted[i] = new StringBuffer();
    	}
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
    		
    		// Replace first half of the collection with dash
    		String s = input[1];
    		if(i < (n / 2)) {
    			s = "-";
    		}
    		
    		s += " ";
    		sorted[x] = sorted[x].append(s);
        }

        bufferedReader.close();
        
        // Print output
        for(int i = 0; i < n; i++) {
    		System.out.print(sorted[i]);
    	}
    }
}
