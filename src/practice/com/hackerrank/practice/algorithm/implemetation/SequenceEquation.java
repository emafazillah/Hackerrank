package com.hackerrank.practice.algorithm.implemetation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SequenceEquation {
	
	public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Since p[n] = p[p(x)], 
        // therefore n = p(x)        
        // Since Map<Integer, Integer> p_traverse = new HashMap<n, p(x)>(), 
        // therefore Map<Integer, Integer> p_inverse = new HashMap<p(x), n>();
        Map<Integer, Integer> p_inverse = new HashMap<Integer, Integer>();
        for(int i = 1; i < (n + 1); i++) p_inverse.put(scan.nextInt(), i);       
        // Since x = p(p(y)), 
        // therefore y = p_inverse(p_inverse(x))
        for(int i = 1; i < (n + 1); i++) System.out.println(p_inverse.get(p_inverse.get(i)));
        scan.close();
    }

}
