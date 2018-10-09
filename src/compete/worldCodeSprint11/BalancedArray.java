package worldCodeSprint11;

import java.util.Scanner;

public class BalancedArray {
	
    static int solve(int[] a){
        int result = 0;        
        int right = 0;
        int left = 0;
        int half = a.length / 2;
        for(int i = 0; i < a.length; i++) {
        	if(i < half) 
        		left += a[i];
        	else 
        		right += a[i];        	
        }
        if(left != right) 
        	 result = Math.abs(left - right);       
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = solve(a);
        System.out.println(result);
    }

}
