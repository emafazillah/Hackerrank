package dataStructures;

import java.util.Scanner;

public class StacksBalancedBracketsV1 {

	// Score 1.67 --> tak paham soklan... patut pakai stack
	public static boolean isBalanced(String expression) {
		char[] arrChar = expression.toCharArray();
		if((arrChar.length % 2) != 0) {
			return false;
		} else {
			int open = arrChar.length / 2;		
			int close = arrChar.length - 1;
			int balance = 0;			
			for(int i = 0; i < open; i++) {
				if(("{").equals(Character.toString(arrChar[i])) && ("}").equals(Character.toString(arrChar[close]))) {
					balance++;
				} else if(("(").equals(Character.toString(arrChar[i])) && (")").equals(Character.toString(arrChar[close]))) {
					balance++;
				} else if(("[").equals(Character.toString(arrChar[i])) && ("]").equals(Character.toString(arrChar[close]))) {
					balance++;
				}
				close--;
			}
			if(balance == open) {
				return true;
			} else {
				return false;
			}
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
