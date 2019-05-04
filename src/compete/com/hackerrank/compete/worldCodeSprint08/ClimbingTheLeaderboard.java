package com.hackerrank.compete.worldCodeSprint08;

import java.util.Scanner;

public class ClimbingTheLeaderboard {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        
        int maxrank = 1;
        for (int i = 1; i < n; i++) {
            if (scores[i] != scores[i - 1]) {
                maxrank++;
            }
        }
 
        int rank = maxrank + 1;
        int j = n - 1;
        for (int a = 0; a < m; a++) {
            while (j >= 0 && alice[a] >= scores[j]) {
                boolean flag = false;
                do {
                    j--;
                    if (!flag) {
                        rank = Math.max(1, rank - 1);
                        flag = true;
                    }
                } while (j > 0 && scores[j + 1] == scores[j]);
            }
 
            System.out.println(rank);
        }
    }

}
