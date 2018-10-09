package implemetation;

import java.util.Scanner;

public class FormingAMagicSquare {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        // arr_count[sum i = 0, sum i = 1, sum i = 2, 
        // 			sum j = 0, sum j = 1, sum j =2, 
        //			sum diagonal left to right, sum diagonal right to left]
        int[] arr_count = new int[8];
        for(int i = 0; i < 8; i++) {
        	switch (i) {
        	case 0:
        		arr_count[i] = s[0][0] + s[0][1] + s[0][2];
        		break;
        	case 1:
        		arr_count[i] = s[1][0] + s[1][1] + s[1][2];
        		break;
        	case 2:
        		arr_count[i] = s[2][0] + s[2][1] + s[2][2];
        		break;
        	case 3:
        		arr_count[i] = s[0][0] + s[1][0] + s[2][0];
        		break;
        	case 4:
        		arr_count[i] = s[0][1] + s[1][1] + s[2][1];
        		break;
        	case 5:
        		arr_count[i] = s[0][2] + s[1][2] + s[2][2];
        		break;
        	case 6:
        		arr_count[i] = s[0][0] + s[1][1] + s[2][2];
        		break;
        	case 7:
        		arr_count[i] = s[0][2] + s[1][1] + s[2][0];
        		break;
        	}        	
        }
        in.close();
    }

}
