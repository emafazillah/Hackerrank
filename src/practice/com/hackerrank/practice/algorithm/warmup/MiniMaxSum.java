package com.hackerrank.practice.algorithm.warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MiniMaxSum {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        in.close();
        
        Long[] arrinput = new Long[5];
        Long[] arrresult = new Long[5];
        arrinput[0] = a;
        arrinput[1] = b;
        arrinput[2] = c;
        arrinput[3] = d;
        arrinput[4] = e;
        
        for (int i = 0; i < 5; i++) {
            long result = 0;
            
            for (int j = 0; j < 5; j++) {
                if (j != i) {
                    result = result + arrinput[j];
                }
            }
            
            arrresult[i] = result;
        }
        
        System.out.println(Collections.min(Arrays.asList(arrresult)) + " " + Collections.max(Arrays.asList(arrresult)));
    }

}
