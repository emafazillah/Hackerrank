package com.hackerrank.compete.womensCodeSprint03;

import java.util.Scanner;

public class BirthdayChocolate {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int output=0;
        if(m==1){
            int result=squares[0];
            if(result==d){
                output++;
            }
        }else{
            for(int i=0;i<n;i++){
                int result=0;
                int count=0;
                while((count<m) && ((i+count)<n)){
                    int start=i+count;
                    result+=squares[start];
                    count++;
                }
                if(result==d){
                    output++;
                }
            }            
        }
        System.out.println(output);
    }

}
