package com.hackerrank.practice.algorithm.implemetation;

import java.util.Scanner;

public class RepeatedString {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();        
        // Step 1, count a in s, a
        char[] chars = s.toCharArray();
        Integer a = 0;
        for(char c : chars) {
        	if(Character.toString(c).equalsIgnoreCase("a")) a++;
        }
        // Step 2, a * (n / length of s)
        Integer s_len = s.length(); 
        Long count = a.longValue() * (n / s_len.longValue());
        //System.out.println("long count==="+count);
        // Step 3, count a in modulo n / length of s        
        if(n % s_len > 0) {
        	Long modul = n % s_len;
        	int endIndex = modul.intValue();
        	//System.out.println("endIndex==="+endIndex);
        	String s_new = s.substring(0, endIndex);
        	//System.out.println("s_new==="+s_new);
        	char[] cc = s_new.toCharArray();
        	for(char c : cc) {
        		if(Character.toString(c).equalsIgnoreCase("a")) count++;
        	}
        }
        System.out.println(count);
        in.close();
    }

}
