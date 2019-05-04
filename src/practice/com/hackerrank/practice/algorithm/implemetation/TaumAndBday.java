package com.hackerrank.practice.algorithm.implemetation;

import java.util.Scanner;

public class TaumAndBday {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long sum = 0;
            if(z >= Math.abs(x - y)) 
            	sum = (b * x) + (w * y);
            else {
            	if(x > y) 
                	sum = (b * (y + z)) + (w * y);
                else if(x < y) 
                	sum = (b * x) + (w * (x + z));
                else 
                	sum = (b * x) + (w * y);
            }
            System.out.println(sum);
        }        
        in.close();
	}

}
