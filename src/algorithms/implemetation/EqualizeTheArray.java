package implemetation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualizeTheArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int count = 1;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i : a) {
			if(!map.containsKey(i)) 
				map.put(i, 1);
			else 
				map.put(i, map.get(i) + 1);
				if(count < map.get(i)) count = map.get(i);				
		}
		System.out.println(n - count);
		scan.close();
	}

}
