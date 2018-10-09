package implemetation;

import java.util.Scanner;

public class SherlockAndSquares {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();        
        for(int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int count = (int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1;
            System.out.println(count);
        }        
        scan.close();
    }

}
