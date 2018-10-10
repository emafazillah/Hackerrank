package worldCodeSprint10;

import java.util.Scanner;

public class ZigzagArray {
	
	// Score 5	
	static int minimumDeletions(int[] a){
        int result = 0; // Default is zigzag. If there is 3 consecutive elements, not zigzag, so return 1.
        int count = 0; // Count for 3 consecutive elements
        int size = a.length;
        for(int i=0;i<size;i++){
        	if((i-2)>=0){
        		if((a[i]>a[i-1]) && (a[i-1]>a[i-2]) && (a[i]>a[i-2])){
        			count++;
        		}else if((a[i]<a[i-1]) && (a[i-1]<a[i-2]) && a[i]<a[i-2]){
        			count++;
        		}
        	}
        }
        if(count>0){
        	result = 1;
        }else{
        	result = 0;
        }   
        return result;
    }

    @SuppressWarnings("resource")
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
