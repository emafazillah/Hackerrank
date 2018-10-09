package implemetation;

import java.util.Scanner;

public class TheHurdleRace {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int count = 0;
        int currentMax = k;
        for(int i = 0; i < n; i++) {        		
        	while(height[i] > currentMax) {        		
        		currentMax++;
        		count++;
        	}
        }
        System.out.println(count);
        in.close();
    }

}
