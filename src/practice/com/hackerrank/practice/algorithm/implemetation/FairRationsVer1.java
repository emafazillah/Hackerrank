package com.hackerrank.practice.algorithm.implemetation;

import java.util.Scanner;

public class FairRationsVer1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        int N = in.nextInt();
        int B[] = new int[N];
        
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        
        int result = fairRations(B);

        if (result == -1) {
        	System.out.println("NO");
        } else {
        	System.out.println(String.valueOf(result));
        }
        
        in.close();
	}
	
	static int fairRations(int[] B) {
    	int N = B.length;
    	
    	// Check if not possible
    	int checkIfNotPossible = 0;
    	for (int i = 0; i < N; i++) {
    		checkIfNotPossible += B[i];
    	}
    	
    	if (checkIfNotPossible % 2 != 0) {
    		return -1;
    	}
    	
    	// Count bread
    	int countBread = 0;
    	boolean allEven = false;
    	
    	while (!allEven) {
            int countEven = 0;
            
            for (int i = 0; i < N; i++) {
                if (B[i] % 2 != 0) {
                    countBread += 2;
                    
                    B[i] += 1;
                    if (i == N - 1) {
                        B[i - 1] += 1;
                    } else {
                        B[i + 1] += 1;    
                    }
                } else {
                    countEven++;
                }
            }
            
            if (countEven == N) {
                allEven = true;
            }
        }
    	
    	return countBread;
    }
	
	public static void version1(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        int distributed_bread = N;
        int count_even = 0;
        while(distributed_bread > -1) {
            System.out.println("distributed_bread==="+distributed_bread);
            for(int i = 0; i < N; i++) {                
                if(B[i] % 2 != 0) {
                    B[i]++;
                    distributed_bread--;
                } else {
                    count_even++;
                }
                System.out.println("B["+i+"]==="+B[i]);
            }
            if(count_even == N) 
                break;
            else 
                count_even = 0;            
        }
        if(count_even == N) {
            System.out.println("N==="+N);
            System.out.println("distributed_bread==="+distributed_bread);
        } else {
            System.out.println("NO");
        }
        in.close();
	}

}
