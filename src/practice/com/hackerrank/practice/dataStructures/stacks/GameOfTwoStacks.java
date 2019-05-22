package com.hackerrank.practice.dataStructures.stacks;

import java.io.IOException;
import java.util.Scanner;

public class GameOfTwoStacks {
	
	static int twoStacks(int x, int[] a, int[] b) {
        int result = 0;
        
        int i = 0;
        int j = 0;
        while(result <= x) {
        	int temp = result;
        	int aPlusB = a[i] + b[j];
        	temp += aPlusB;
        	if(temp <= x) {
        		result = temp;
        		++i;
        		++j;
        	} else {
        		temp = result;
        		temp += a[i];
        		if(temp <= x) {
        			result = temp;
        			++i;
        		} else {
        			temp = result;
        			temp += b[j];
        			if(temp <= x) {
        				result = temp;
        				++j;
        			} else {
        				break;
        			}
        		}
        	}
        }
        
		return i + j;
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
