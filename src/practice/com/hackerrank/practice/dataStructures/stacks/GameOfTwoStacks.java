package com.hackerrank.practice.dataStructures.stacks;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {
	
	static int twoStacks(int x, int[] a, int[] b) {
        // Put array "a" into a stack
        int count = a.length - 1;
        Stack<Integer> stackA = new Stack<>();
        while(count > -1) {
        	stackA.push(a[count]);
        	--count;
        }
        
        // Put array "b" into a stack
        count = b.length - 1;
        Stack<Integer> stackB = new Stack<>();
        while(count > -1) {
        	stackB.push(b[count]);
        	--count;
        }
        
        // Escape if sum of removed integers from stack exceed x
        int sum = 0;
        int total = 0;
        while(sum <= x) {
        	if((sum + stackA.peek() + stackB.peek()) <= x) {
        		sum += stackA.peek() + stackB.peek();
        		total += 2;
        		stackA.pop();
        		stackB.pop();
        	} else {
        		if((sum + stackA.peek()) <= x) {
        			sum += stackA.peek();
            		total += 1;
            		stackA.pop();
        		} else {
        			if((sum + stackB.peek()) <= x) {
            			sum += stackB.peek();
                		total += 1;
                		stackB.pop();
            		} else {
            			break;
            		}
        		}
        	}
        }
        
		return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
            
            System.out.println(result);
        }

        //bufferedWriter.close();
    }
}
