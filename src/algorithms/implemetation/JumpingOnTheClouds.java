package implemetation;

import java.util.Scanner;

public class JumpingOnTheClouds {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int jump = 0;
        for(int i = 0; i < n;) {
        	int curr = 0;
        	int plus_1 = 0;
        	int plus_2 = 0;
        	if(i < (n - 1)) {
        		if((i + 2) > (n - 1)) {
        			curr = c[i];
                	plus_1 = c[i+1];
                	if(curr == 0 && plus_1 == 0) {
                		jump++;
                		i += 1;
                	}
        		} else {
        			curr = c[i];
                	plus_1 = c[i+1];
                	plus_2 = c[i+2];
                	if(curr == 0 && plus_1 == 0 && plus_2 == 0) {
                		jump++;
                		i += 2;
                	} else if(curr == 0 && plus_1 == 0 && plus_2 == 1) { 
                		jump++;
                		i += 1;
                	} else if(curr == 0 && plus_1 == 1 && plus_2 == 0) { 
                		jump++;
                		i += 2;
                	}
        		}
        	} else {
        		i += 1;
        	}
        	//System.out.println("i==="+i);
        }
        System.out.println(jump);
        in.close();
    }

}
