package com.hackerrank.practice.dataStructures.stacks;

//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {

	/*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
    	int totalStack1 = 0;
    	int totalStack2 = 0;
    	int totalStack3 = 0;
    	
        Stack<Integer> stack1 = new Stack<>();
        for(int i = 0; i < h1.length; i++) {
        	stack1.push(h1[i]);
        	totalStack1 += h1[i];
        }
        
        Stack<Integer> stack2 = new Stack<>();
        for(int i = 0; i < h2.length; i++) {
        	stack2.push(h2[i]);
        	totalStack2 += h2[i];
        }
        
        Stack<Integer> stack3 = new Stack<>();
        for(int i = 0; i < h3.length; i++) {
        	stack3.push(h3[i]);
        	totalStack3 += h3[i];
        }
        
        while(totalStack1 != totalStack2 && totalStack1 != totalStack3) {
        	totalStack1 -= stack1.peek();
        	stack1.pop();
        	
        	totalStack2 -= stack2.peek();
        	stack2.pop();
        	
        	totalStack3 -= stack3.peek();
        	stack3.pop();
        }

    	return totalStack1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	Scanner scanner = new Scanner(System.in);

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        
        System.out.println(String.valueOf(result));
        
        scanner.close();
    }
    
}
