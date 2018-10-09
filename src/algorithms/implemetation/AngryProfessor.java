package implemetation;

import java.util.Scanner;

public class AngryProfessor {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();               
        for(int h = 0; h < T; h++) {
        	int N = scan.nextInt();
            int K = scan.nextInt();
            int[] a = new int[N];
        	for(int i = 0; i < N; i++) {
            	a[i] = scan.nextInt();
            }
        	int count = 0;
        	for(int i = 0; i < N; i++) {
        		if(a[i] <= 0) count++;        			
        	}
        	if(count < K) 
        		System.out.println("YES"); // Class cancelled
        	else 
        		System.out.println("NO"); // Class not cancelled
        }
        scan.close();
    }

}
