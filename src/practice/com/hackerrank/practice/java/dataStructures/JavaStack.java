package com.hackerrank.practice.java.dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
	
	public static void main(String [] argh) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input = sc.next();
            //Complete the code
			System.out.println(isBalanced(input));
		}
		
		sc.close();
	}
	
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

}
