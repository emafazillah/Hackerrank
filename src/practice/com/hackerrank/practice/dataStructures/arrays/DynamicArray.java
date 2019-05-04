package com.hackerrank.practice.dataStructures.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Input
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // no. of sequence
		int Q = scan.nextInt(); // no. of query
		int[][] arrQ = new int[Q][3];
		for (int i = 0; i < Q; i++) {
			for (int j = 0; j < 3; j++) {
				arrQ[i][j] = scan.nextInt();
			}
		}
		// Dynamic Array
		int lastAns = 0;
		ArrayList<ArrayList<Integer>> seqList = new ArrayList<>(); // seqList, N of empty sequence, seq
		for (int count = 0; count < N; count++) {
			seqList.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < Q; i++) {
			int selectQuery = arrQ[i][0];
			int x = arrQ[i][1];
			int y = arrQ[i][2];
			int seqN = (x ^ lastAns) % N; // Sequence number
			ArrayList<Integer> seq = seqList.get(seqN);
			if (selectQuery == 1) { // Query 1
				seq.add(y); // Append y
			} else { // Query 2
				int element = y % seq.size(); // y % size
				lastAns = seq.get(element);
				System.out.println(lastAns);
			}
		}
	}

}
