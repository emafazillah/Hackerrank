package com.hackerrank.practice.algorithm.implemetation;

import java.util.Scanner;

public class AppleAndOrange {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(); // min range
        int t = in.nextInt(); // max range
        int a = in.nextInt(); // apple position
        int b = in.nextInt(); // orange position
        int m = in.nextInt(); // no of apple
        int n = in.nextInt(); // no of orange
        int[] appledistance=new int[m];
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            appledistance[apple_i]=a+apple[apple_i];
        }
        int[] orangedistance=new int[n];     
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            orangedistance[orange_i]=b+orange[orange_i];
        }
        // apple
        int countapple=0;
        for(int i=0;i<m;i++){
        	if((appledistance[i]>=s) && (appledistance[i]<=t)){
        		countapple++;
        	}
        }
        // orange
        int countorange=0;
        for(int j=0;j<n;j++){
        	if((orangedistance[j]>=s) && (orangedistance[j]<=t)){
        		countorange++;
        	}
        }
        System.out.println(countapple);
        System.out.println(countorange);
        in.close();
    }

}
