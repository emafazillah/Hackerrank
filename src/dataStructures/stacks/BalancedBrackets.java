package stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	
	public static void main(String...strings) {
		// Input
		Scanner scanner = new Scanner(System.in);
		int countInput = scanner.nextInt();
		String[] inputs = new String[countInput];
		for(int i = 0; i < countInput; i++) {
			inputs[i] = scanner.next();
		}
		
		// Output
		for(int i = 0; i < countInput; i++) {
			String result = isBalanced(inputs[i]);
			System.out.println(result);
		}
		
		scanner.close();
	}
	
	// Complete the isBalanced function below.
    static String isBalanced(String s) {
    	// Input length
    	int length = s.length();
    	
    	// Check if even. If odd return "NO"
    	if(length % 2 != 0) {
    		return "NO";
    	}
    	
    	Stack<Character> stack = new Stack<>();
    	for(Character c : s.toCharArray()) {
    		switch(c) {
	    		case '{':
	    			stack.push('}');
	    			break;
	    		case '[':
	    			stack.push(']');
	    			break;
	    		case '(':
	    			stack.push(')');
	    			break;
    			default:
    				if(stack.isEmpty() || c != stack.peek()) {
    					return "NO";
    				}
    			stack.pop();
    		}
    	}
    	
    	if(stack.isEmpty()) {
    		return "YES";
    	} else {
    		return "NO";
    	}
    }

}
