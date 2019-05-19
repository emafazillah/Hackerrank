package com.hackerrank.practice.dataStructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
	
	public static void main(String...strings) {
		// Input
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = 0;
		String inputString = "";
		Stack<String> stack = new Stack<>();
		stack.push(inputString);
		
		while(count < N) {
			int k = 0;
			int input = scanner.nextInt();
			switch(input) {
				case 1:
					// Append string
					inputString = stack.peek();
					inputString += scanner.next();
					stack.push(inputString);
					break;
				case 2:
					// Delete the last kth character
					k = scanner.nextInt();
					inputString = stack.peek();
					inputString = inputString.substring(0, stack.peek().length() - k);
					stack.push(inputString);
					break;
				case 3:
					// Print the kth character
					k = scanner.nextInt();
					inputString = stack.peek();
					System.out.println(inputString.charAt(k - 1));
					break;
				case 4:
					// Undo
					stack.pop();
					break;
			}
			
			++count;
		}
		
		scanner.close();
	}

}
