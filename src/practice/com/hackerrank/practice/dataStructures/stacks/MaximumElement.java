package com.hackerrank.practice.dataStructures.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) {
		// Input
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        int N = scanner.nextInt();
        int count = 0;
        while(count < N) {
        	int input = scanner.nextInt();
        	inputList.add(input);
        	if(input == 1) {
        		inputList.add(scanner.nextInt());
        	}
        	++count;
        }
        
        scanner.close();
        
        // Create Stack
        Stack<Integer> stack = new Stack<>();
        
        for(Integer input : inputList) {
        	switch(input) {
	        	case 1:
	        		// next value push into stack
	        		break;
	        	case 2: 
	        		// delete from stack
	        		if(!stack.isEmpty()) {
	        			stack.pop();
	        		}
	        		break;
	        	case 3: 
	        		// print the maximum element in the stack
	        		System.out.println(stack.peek());
	        		break;
        		default:
        			stack.push(input);
        			break;
        	}
        }
    }
	
}
