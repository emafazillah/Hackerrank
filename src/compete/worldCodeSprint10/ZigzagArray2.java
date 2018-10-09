package worldCodeSprint10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZigzagArray2 {
	
	// Score 20
	static int minimumDeletions(int[] a){
        int result = 0; // Count for deletion to be zigzag
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
        	list.add(a[i]);
        }
        int index = 0; // list index
        while(list.size()>=3){        	
        	if( (index-2) >= 0 ) {
        		if( (list.get(index) > list.get(index-1)) && (list.get(index-1) > list.get(index-2)) ) {
        			result++;        			
        		} else if( (list.get(index) < list.get(index-1)) && (list.get(index-1) < list.get(index-2)) ) {
        			result++;
        		}
        		list.remove(index-2);
        		index=0;
        	} else {
        		index++;
        	}
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Return the minimum number of elements to delete to make the array zigzag
        int result = minimumDeletions(a);
        System.out.println(result);
    }

}
