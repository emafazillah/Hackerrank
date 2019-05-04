package com.hackerrank.practice.algorithm.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {
		
	static int gemstones(String[] arr){
        Set<Character> intersect = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
        	char[] chars = (arr[i]).toCharArray();
        	Set<Character> charlist = new HashSet<>();
        	for(char e : chars) charlist.add(e);
        	if(i == 0)
        		intersect = charlist;
        	else 
        		intersect.retainAll(charlist);
        }
        return intersect.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
        in.close();
    }

}
