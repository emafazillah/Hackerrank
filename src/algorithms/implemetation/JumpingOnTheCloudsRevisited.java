package implemetation;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // number of clouds
		int k = scan.nextInt(); // jump size
		int[] c = new int[n]; // cloud array
		for(int i = 0; i < n; i++) {
			c[i] = scan.nextInt();
		}
		int E = 100; // Energy
		int jump = 0;
		jump = jump + k;
		while(jump < n) {
			//System.out.println("jump to==="+jump);
			E--; // ordinary cloud
			if(c[jump] == 1) // thundercloud				
				E = E - 2;
			System.out.println("E==="+E);
			jump = jump + k;
		}
		// Back to cloud0
		//System.out.println("jump to===0");
		E--; // ordinary cloud
		if(c[0] == 1) 
			E = E -2; // thundercloud
		System.out.println(E);
		scan.close();
	}

}
