package day0ToDay30;

import java.util.Arrays;
import java.util.Scanner;

public class Day11 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int result[] = new int[16];
        int count = 0;
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                result[count] = arr[x][y] + arr[x][y+1] + arr[x][y+2] + 
                    arr[x+1][y+1] + arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];
                count++;            
            }
        }
        Arrays.sort(result);
        System.out.println(result[15]);
        in.close();
    }

}
