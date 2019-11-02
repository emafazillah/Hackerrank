package com.hackerrank.practice.java.dataStructures;

import java.util.Scanner;

public class Java1DArrayPart2 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
	
	public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
		int len = game.length;
		int i = 0;
		int iLastVisited = i;
		while (i > -1 && i < len) {
			if (game[i] == 0) {
				if (i + leap < len && game[i + leap] == 0) {
					iLastVisited = i;
					i = i + leap;
				} else if (i + leap >= len) {
					return true;
				} else if (game[i + 1] == 0) {
					iLastVisited = i;
					i = i + 1;
				} else {
					--i;
				}
			} else {
				--i;
			}
			
			if (i == iLastVisited) {
				return false;
			}
		}
		
		return false;
    }

}
