package implemetation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumDistances {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        List<Integer> min = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {        	
        	for(int j = 0; j < n; j++) {
        		if(i != j) {
        			int a_i = A[i];
        			int a_j = A[j];
        			if(a_i == a_j) min.add(Math.abs(i - j));
        		}
        	}
        }
        if(min.size() > 1) {
        	Collections.sort(min);
            System.out.println(min.get(0));
        } else 
        	System.out.println("-1");        
		in.close();
	}

}
