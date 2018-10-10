package worldCodeSprint10;

import java.util.Scanner;

public class RewardPoints {
		
	// Score 10
	static int getPoints(int month1, int month2, int month3){
        int total = 0;
        month1 = month1 * 10;
        if(month1 > 100){
        	month1 = 100;
        }
        month2 = month2 * 10;
        if(month2 > 100){
        	month2 = 100;
        }
        month3 = month3 * 10;
        if(month3 > 100){
        	month3 = 100;
        }
        total = month1 + month2 + month3;
        return total;
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month1 = in.nextInt();
        int month2 = in.nextInt();
        int month3 = in.nextInt();
        int pointsEarned = getPoints(month1, month2, month3);
        System.out.println(pointsEarned);
    }

}
