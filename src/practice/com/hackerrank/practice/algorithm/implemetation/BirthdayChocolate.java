package com.hackerrank.practice.algorithm.implemetation;

import java.util.Scanner;

public class BirthdayChocolate {
	
	static int getWays(int[] squares, int d, int m){
		int result=0;
        int output=0;
        if(m==1){
            result=squares[0];
            if(result==d){
                output++;
            }
        }else{
            for(int i=0;i<squares.length;i++){
                result=0;
                int count=0;
                while((count<m) && ((i+count)<squares.length)){
                    int start=i+count;
                    result+=squares[start];
                    count++;
                }
                if(result==d){
                    output++;
                }
            }            
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
        in.close();
    }

}
