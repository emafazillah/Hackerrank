package com.hackerrank.practice.dataStructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxElement = new Stack<>();
        while(count < N) {
        	int input = scanner.nextInt();
        	
        	if(input == 1) {
        		// next value push into stack
        		stack.push(scanner.nextInt());
        		
        		// update new maximum element
        		if(maxElement.isEmpty()) {
        			maxElement.push(stack.peek());
        		} else {
        			if(stack.peek() > maxElement.peek()) {
        				maxElement.push(stack.peek());
        			}
        		}
        	} else if(input == 2) {
        		// delete from stack if not empty
        		if(!stack.isEmpty()) {
        			if((stack.peek()).equals(maxElement.peek())) {
        				maxElement.pop();
        			}
        			stack.pop();
        		} 
        		// else update maximum element
        		else {
        			maxElement = new Stack<>();
        		}
        	} else if(input == 3) {
        		// print the maximum element in the stack        		
        		System.out.println(maxElement.peek());
        	}
        	
        	count++;
        }
        
        scanner.close();
    }
	
}
