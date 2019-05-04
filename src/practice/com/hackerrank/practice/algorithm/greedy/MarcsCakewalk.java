package com.hackerrank.practice.algorithm.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MarcsCakewalk {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] calories = new Integer[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories, Collections.reverseOrder());
        Long calories_count = 0L;
        for(int i = 0; i < n; i++) {
            Double power = new Double(Math.pow(2, Double.parseDouble(Integer.toString(i))));
            calories_count += Long.parseLong(Integer.toString(calories[i])) * power.longValue();
        }
        System.out.println(calories_count);
        in.close();
    }

}
