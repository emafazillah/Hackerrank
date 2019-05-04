package com.hackerrank.practice.algorithm.strings;

import java.util.Scanner;

public class Pangrams {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        while (scan.hasNext()) {
            input = input + scan.next();
        }
        scan.close();
        
        char[] arr = input.toCharArray();
        String[] check = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; 
        int[] count = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < arr.length; i++) {
            String test = (Character.toString(arr[i])).toUpperCase();
            for (int j = 0; j < 26; j++) {
                if (test.equals(check[j])) {
                    count[j]++;
                }
            }
        }
        
        int checknotpangram = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                checknotpangram++;
            }
        }
        
        String result = "";        
        if (checknotpangram > 0) {
            result = "not pangram";
        } else {
            result = "pangram";
        }

        System.out.println(result);
    }

}
