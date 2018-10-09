package day0ToDay30;

import java.util.Scanner;

public class Day20 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noofinput = scan.nextInt();
        int[] swap = new int[noofinput];
        for (int i = 0; i < noofinput; i++) {
            swap[i] = scan.nextInt();
        }
        
        int noofswap = 0;
        for (int i = 0; i < noofinput; i++) {
            for (int j = 0; j < noofinput - 1; j++) {
                if (swap[j] > swap[j+1]) {
                    int temp = 0;
                    temp = swap[j];
                    swap[j] = swap[j+1];
                    swap[j+1] = temp;
                    noofswap++;
                }
            }
            
            if (noofswap == 0) {
                break;
            }
        }
        
        System.out.println("Array is sorted in "+noofswap+" swaps.");
        System.out.println("First Element: "+swap[0]);
        System.out.println("Last Element: "+swap[noofinput-1]);
        scan.close();
    }

}
