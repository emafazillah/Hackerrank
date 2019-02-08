package interviewPreparationKit;

//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MarkAndToys {
	
	// Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
    	// Convert integer array to list
    	List<Integer> pricesList = Arrays.stream(prices).boxed().collect(Collectors.toList());
    	
    	// Sort collection
    	Collections.sort(pricesList);
    	
    	// List to store toy's count
    	List<Integer> list = new ArrayList<>();
    	
    	// Calculate sum and toy's count
    	for(int i = 0; i < pricesList.size(); i++) {
    		int j = i;
    		int sum = 0;
    		int count = 0;
    		
    		while(j < pricesList.size()) {
    			sum += pricesList.get(j);
        		if(sum < k + 1) {
        			++count;
        		} else {
        			break;
        		}
        		
        		++j;
        	}
    		
    		list.add(count);
    	}
    	
    	// Sort collections
    	Collections.sort(list);
    	
    	return list.get(list.size() - 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        
        System.out.println(result);

        scanner.close();
    }

}
