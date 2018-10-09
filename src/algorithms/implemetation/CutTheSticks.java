package implemetation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < N; i++) {
        	a.add(scan.nextInt());
        }        
        while(a.size() > 0) {
        	Collections.sort(a);
            int cut = a.get(0); // cut operation smallest stick length
        	System.out.println(a.size());
        	List<Integer> a_temp = new ArrayList<Integer>();
        	for(int j = 0; j < a.size(); j++) {
        		int length = a.get(j) - cut; 
        		if(length > 0) a_temp.add(length);
        	}
        	a = a_temp;
        }
        scan.close();
    }

}
