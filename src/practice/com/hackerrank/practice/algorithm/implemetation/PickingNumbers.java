package com.hackerrank.practice.algorithm.implemetation;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
//import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//import java.util.stream.Stream;

//import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    	Collections.sort(a);  	
    	int countMax = 0;
    	int countCurrent = 1;
    	int[] arr = new int[2];
    	for (int i = 0; i < a.size(); i++) {
    		if (i == 0) {
    			arr[0] = 0;
    			arr[1] = a.get(i);
    		} else {
    			if(countCurrent > countMax) {
					countMax = countCurrent;
				}
    			
    			if (Math.abs(a.get(i) - a.get(i - 1)) > 1) {
    				countCurrent = 1;
    				arr[0] = 0;
        			arr[1] = a.get(i);
    			} else if (a.get(i) - a.get(i - 1) == 0) {
    				++countCurrent;
    			} else {
    				if(arr[0] == 0) {
    					++countCurrent;
        				arr[0] = a.get(i - 1);
            			arr[1] = a.get(i);
    				} else {
    					countCurrent = 1;
    					arr[0] = 0;
            			arr[1] = a.get(i);
    				}
    			}
    		}
    	}
    	
    	if (countCurrent > countMax) {
			countMax = countCurrent;
		}
    	return countMax;
    }

}

public class PickingNumbers {
	
	public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int n = Integer.parseInt(bufferedReader.readLine().trim());
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(scanner.nextInt());
		}

        int result = Result.pickingNumbers(a);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
        System.out.println(String.valueOf(result));

//        bufferedReader.close();
//        bufferedWriter.close();
        scanner.close();
    }

}
