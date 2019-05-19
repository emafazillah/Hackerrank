package com.hackerrank.practice.dataStructures.stacks;

import java.io.IOException;
import java.util.Scanner;

public class Waiter {
	
	static int[] waiter(int[] number, int q) {
        
		return null;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        int[] number = new int[n];

        String[] numberItems = scanner.nextLine().split(" ");

        for (int numberItr = 0; numberItr < n; numberItr++) {
            int numberItem = Integer.parseInt(numberItems[numberItr].trim());
            number[numberItr] = numberItem;
        }

        int[] result = waiter(number, q);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            //bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                //bufferedWriter.write("\n");
            }
        }

        //bufferedWriter.newLine();

        //bufferedWriter.close();
    }
}
