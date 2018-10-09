package implemetation;

import java.util.Scanner;

public class FairRations {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        int distributed_bread = N;
        int count_even = 0;
        while(distributed_bread > -1) {
            System.out.println("distributed_bread==="+distributed_bread);
            for(int i = 0; i < N; i++) {                
                if(B[i] % 2 != 0) {
                    B[i]++;
                    distributed_bread--;
                } else {
                    count_even++;
                }
                System.out.println("B["+i+"]==="+B[i]);
            }
            if(count_even == N) 
                break;
            else 
                count_even = 0;            
        }
        if(count_even == N) {
            System.out.println("N==="+N);
            System.out.println("distributed_bread==="+distributed_bread);
        } else {
            System.out.println("NO");
        }
        in.close();
	}

}
