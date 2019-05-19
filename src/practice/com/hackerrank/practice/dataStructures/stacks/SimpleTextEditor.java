package com.hackerrank.practice.dataStructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
	
	public static void main(String...strings) {
		// Input
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = 0;
		Stack<String> stack = new Stack<>();
		
		while(count < N) {
			int input = scanner.nextInt();
			if(input == 1) {
				// Append string
				stack.push(scanner.next());
			} else if(input == 2) {
				// Delete the last kth character
				int k = scanner.nextInt() - 1;
				String inputString = stack.peek();
				while(k > -1) {
					inputString = inputString.substring(k);
					--k;
				}
				stack.push(inputString);
			} else if(input == 3) {
				// Print the kth character
				int k = scanner.nextInt();
				char[] charArray = stack.peek().toCharArray();
				System.out.println(charArray[k - 1]);
			} else if(input == 4) {
				// Undo
				stack.pop();
			}
			
			++count;
		}
		
		scanner.close();
	}

}
