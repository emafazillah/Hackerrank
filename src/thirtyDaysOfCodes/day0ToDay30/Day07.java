package day0ToDay30;

import java.util.Scanner;

public class Day07 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];        
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        int[] arrreverse = new int[n];
        int countreverse = n - 1;
        String result = "";
        for (int j = 0; j < n; j++) {
            arrreverse[j] = arr[countreverse];
            countreverse--;
            result = result + Integer.toString(arrreverse[j]) + " ";
        }
        
        result = result.trim();
        System.out.println(result);
    }

}
