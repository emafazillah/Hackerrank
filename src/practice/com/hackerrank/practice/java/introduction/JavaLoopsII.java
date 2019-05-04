package com.hackerrank.practice.java.introduction;

import java.util.Scanner;

public class JavaLoopsII {
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int[] intresultarr = new int[n];
            String strresult = "";
            for (int j = 0; j < n; j++) {
                double dj = Double.parseDouble(Integer.toString(j));
                int pj = (int) Math.pow(2, dj);
                if (j == 0) {
                    intresultarr[j] = a + (pj * b);
                } else {
                    intresultarr[j] = intresultarr[j - 1] + (pj * b);
                }
                
                strresult = strresult + Integer.toString(intresultarr[j]) + " ";
            }
            
            strresult = strresult.trim();
            System.out.println(strresult);
        }
        in.close();
    }

}
