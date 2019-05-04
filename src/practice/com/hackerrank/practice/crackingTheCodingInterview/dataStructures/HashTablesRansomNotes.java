package com.hackerrank.practice.crackingTheCodingInterview.dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTablesRansomNotes {
	
	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public HashTablesRansomNotes(String magazine, String note) {
    	// Put magazine String into Map
    	magazineMap = new HashMap<String, Integer>();
        for(String item : magazine.split(" ")) {
        	Integer count = magazineMap.get(item);
        	if(count == null) {
        		magazineMap.put(item, 1);
        	} else {
        		magazineMap.put(item, count + 1);
        	}
        }
        // Put note String into Map
        noteMap = new HashMap<String, Integer>();
        for(String item : note.split(" ")) {
        	Integer count = noteMap.get(item);
        	if(count == null) {
        		noteMap.put(item, 1);
        	} else {
        		noteMap.put(item, count + 1);
        	}
        }
    }
    
    public boolean solve() {
    	// Compare 
    	for(Map.Entry<String, Integer> map : noteMap.entrySet()) {    		
    		if(magazineMap.get(map.getKey()) == null) {
    			return false;
    		} else {
    			if(map.getValue() > magazineMap.get(map.getKey())) {
    				return false;
    			}
    		}
    	}
    	return true;
    }

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        HashTablesRansomNotes s = new HashTablesRansomNotes(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }

}
