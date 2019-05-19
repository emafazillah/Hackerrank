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
			int k = 0;
			String inputString = "";
			int input = scanner.nextInt();
			switch(input) {
				case 1:
					// Append string
					if(!stack.isEmpty()) {
						inputString = stack.peek();
					} else {
						inputString = "";
					}
					inputString += scanner.next();
					stack.push(inputString);
					break;
				case 2:
					// Delete the last kth character
					k = scanner.nextInt() - 1;
					inputString = stack.peek();
					inputString = inputString.substring(k, k);
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
