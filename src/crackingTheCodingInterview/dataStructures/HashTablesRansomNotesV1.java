package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTablesRansomNotesV1 {
	
	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    // Score 8/20
    public HashTablesRansomNotesV1(String magazine, String note) {
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
    	int count = noteMap.size();
    	for(Map.Entry<String, Integer> map : noteMap.entrySet()) {
    		if(magazineMap.get(map.getKey()) != null) {
    			count--;
    		}
    	}
    	if(count == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        HashTablesRansomNotesV1 s = new HashTablesRansomNotesV1(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }

}
