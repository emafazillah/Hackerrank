package com.hackerrank.practice.algorithm.implemetation;

import java.util.Scanner;

public class CatsAndAMouse {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt(); // cat B
            int y = in.nextInt(); // cat A
            int z = in.nextInt(); // mouse C
            int distanceA = Math.abs(x - z);
        	int distanceB = Math.abs(y - z);
        	if(distanceA == distanceB) {
        		System.out.println("Mouse C");
        	} else if(distanceB > distanceA) {
        		System.out.println("Cat A");
        	} else {
        		System.out.println("Cat B");
        	}
        }
        in.close();
    }

}
