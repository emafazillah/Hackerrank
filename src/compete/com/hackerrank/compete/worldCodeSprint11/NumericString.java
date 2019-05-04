package com.hackerrank.compete.worldCodeSprint11;

import java.util.Scanner;

public class NumericString {
	
	// Score 13.50
	static int getMagicNumber(String s, int k, int b, int m){
		int result = 0;
        int start = 0;
        char[] arr = s.toCharArray();
        int size = arr.length;                
        while(size - (start + k) >= 0) {
        	//System.out.println(size - (start + k));
    		String ss = "";
    		int last = start + k;
        	for(int i = start; i < last; i++) {
        		ss = ss + Character.toString(arr[i]);
    			//System.out.println("ss===" + ss);
        		if(i == (last - 1)) {        			
        			int b3tob10 = Integer.parseInt(ss, b);
        			//System.out.println("b3tob10===" + b3tob10);
        			int modM = b3tob10 % m;
        			//System.out.println("modM===" + modM);
        			result += modM;
        		}
        	}
        	start++;
        }
        return result;
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int result = getMagicNumber(s, k, b, m);
        System.out.println(result);
    }

}
