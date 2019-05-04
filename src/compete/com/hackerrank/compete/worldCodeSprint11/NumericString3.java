package com.hackerrank.compete.worldCodeSprint11;

import java.util.Scanner;

public class NumericString3 {
	
	// Score 13.50
	static int getMagicNumber(String s, int k, int b, int m){
		int result = 0;
		long size = s.length();
        long start = 0;
        long last = start + (Long.parseLong(Integer.toString(k)));
        while((size - last) >= 0) {    		    		
    		String ss = s.substring(Math.toIntExact(start), Math.toIntExact(last));
    		int b3tob10 = Integer.parseInt(ss, b);
			int modM = b3tob10 % m;
			result += modM;
        	start++;
        	last = start + (Long.parseLong(Integer.toString(k)));
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
