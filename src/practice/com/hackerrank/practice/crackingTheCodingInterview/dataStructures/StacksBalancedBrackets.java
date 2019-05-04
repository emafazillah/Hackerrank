package com.hackerrank.practice.crackingTheCodingInterview.dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class StacksBalancedBrackets {
	
	public static boolean isBalanced(String expression) {
		if ((expression.length() % 2) != 0) { // Check if string is even
			return false;
		} else {			
			Stack<Character> stack = new Stack<>();
			for (Character bracket : expression.toCharArray()) {
				switch (bracket) {
					case '{':
						stack.push('}');
						break;
					case '(':
						stack.push(')');
						break;
					case '[':
						stack.push(']');
						break;
					default:
						if(stack.empty() || bracket != stack.peek()) { // Check if stack is empty or top of stack is close bracket
							return false;
						}
					stack.pop();
				}
			}
			return stack.isEmpty();
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
	}

}
