package implemetation;

import java.util.Scanner;

public class DrawingBook {
	
	static int solve(int n, int p){
		// left to right
		int left = p / 2;
		// right to left
		int right = 0;
		int curpage = n;
		while((curpage / 2) > (p / 2)) {
			curpage = curpage - 2;
			right++;
		}
		if(left > right)
			return right;
		else
			return left;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
        in.close();
    }

}
