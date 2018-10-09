package worldCodeSprint10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class MaximalAndSubsequences {
	
	// Not finished. TODO
	static long[] solve(int n, int k, long[] a) {
		long[] output = new long[2];
		List<Long> list = new ArrayList<Long>(); // To save bitwise AND result
		int current_idx = 0;
		while( current_idx < (n-k+1) ){
			int next_idx = current_idx + 1;
			for(int i=next_idx; i<n; i++){
				// Bitwise AND operation
				long bitwise = a[current_idx]; // count 0
				System.out.println("current_idx==="+current_idx);
				int count = 1;
				while(count<k){
					int idx = current_idx+count;
					System.out.println("idx==="+idx);
					bitwise = bitwise & a[idx];
					count++;
				}
				System.out.println("bitwise==="+bitwise);
				list.add(bitwise);
			}
			current_idx++;			
		}		
		System.out.println("list size==="+list.size());
		// Put into Map
		TreeMap<Long, Long> treemap = new TreeMap<Long, Long>();
		long count = 1; // Initiate count bitwise AND result
		for(int j=1; j<list.size(); j++){
			if(list.get(j) == list.get(j-1)){
				count++;
			}else{
				if( j == (list.size() - 1) ){
					treemap.put(list.get(j-1), count);
				}
				count=1;
			}
			if( j == (list.size() - 1) ){
				treemap.put(list.get(j), count);
			}
		}
		// Get MAX bitwise
		output[0] = treemap.lastEntry().getKey();		
		// Get modulo 
		long modulo = 1000000007; // Math.pow(10, 9) + 7;
		output[1] = treemap.lastEntry().getValue() % modulo;
		return output;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		long[] a = new long[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextLong();
		}
		long[] result = solve(n, k, a);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != n - 1 ? "\n" : ""));
		}
		System.out.println("");
	}

}
