package dataStructures;

import java.util.Scanner;

public class JavaSubarray {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] input = new int[n];
		for (int i=0;i<n;i++) {
			input[i] = s.nextInt(); 
		}
		
		int countsumnegative=0; // count if sum negative
		int diff=1;
        while(diff<=n){
            int start=0;
            int len=n;
            while(start<n && len>0 && (start+diff)<=n){
                int sumnegative=0;
                int end=start+diff;
                for (int j=start;j<end;j++) {
                    sumnegative+=input[j];
                }
                if (sumnegative<0) {
                    countsumnegative++;
                }
                start++;
                len--;
            }
            diff++;
        }
		
		System.out.println(countsumnegative);
		s.close();
    }

}
