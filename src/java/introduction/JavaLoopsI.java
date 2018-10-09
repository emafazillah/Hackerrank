package introduction;

import java.util.Scanner;

public class JavaLoopsI {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for (int i = 0; i < 10; i++) {
            int count = i + 1;
            int intresult = N * count;
            String strresult = Integer.toString(N) + " x " + Integer.toString(count) + " = " + Integer.toString(intresult);
            System.out.println(strresult);
        }
        in.close();
    }

}
