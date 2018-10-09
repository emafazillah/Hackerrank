package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoDimentionArray {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        // 6x6 2D-Array
        int[] sumHourglasses = new int[16]; 
        int count = 0;
        for(int x=0;x<4;x++){
        	for(int y=0;y<4;y++){
        		sumHourglasses[count] = arr[x][y] + arr[x][y+1] + arr[x][y+2] +  
        				arr[x+1][y+1] + 
        				arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2]; 
        		count++;
        	}
        }
        Arrays.sort(sumHourglasses);
        System.out.println(sumHourglasses[15]);
    }

}
