package com.hackerrank.practice.java.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n no. of elements
        List<Integer> l = new ArrayList<Integer>(); // elements
        for (int i = 0; i < n; i++) {
            int item = sc.nextInt();
            l.add((Integer) item);
        }        
        int q = sc.nextInt();
        for (int j = 0; j < q; j++) {
        	String query = sc.next(); // query instruction
        	int idx = sc.nextInt(); // index        	
        	if ("Insert".equalsIgnoreCase(query)) {        		
        		int element = sc.nextInt();
        		l.add(idx, element);
        	} else {        		
        		l.remove(idx);       		
        	}
        }
        String result = "";
        for (Integer item : l) {
            result = result + " " + item.toString();
        }
        System.out.println(result.trim());
        sc.close();
    }

}
