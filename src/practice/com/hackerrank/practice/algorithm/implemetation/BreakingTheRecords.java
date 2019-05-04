package com.hackerrank.practice.algorithm.implemetation;

import java.util.Scanner;

public class BreakingTheRecords {
	
	static int[] getRecord(int[] s){
        int[] result = new int[2];
        int lowest = 0, scoreLowest = 0;
        int highest = 0, scoreHighest = 0;
        for(int i = 0; i < s.length; i++){
        	if(i>0){
        		if(s[i]>scoreHighest){
        			highest++;
        			scoreHighest=s[i];
        		}else if ((s[i]<scoreHighest) && (s[i]<scoreLowest)){
        			lowest++;
        			scoreLowest=s[i];
        		}
        	}else{
        		scoreLowest=s[i];
        		scoreHighest=s[i];
        	}
        }        
        result[0] = highest;
        result[1] = lowest;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
        in.close();
    }

}
