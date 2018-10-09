package implemetation;

import java.util.Scanner;

public class BonAppetit {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        int bActual = 0;
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();            
            if (i != k) {
                bActual = bActual + c[i];
            }
        }
        int bCharge = in.nextInt();
        bActual = bActual / 2;
        int result = Math.abs(bActual - bCharge);
        if (result == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(result);
        }
        in.close();
    }

}
