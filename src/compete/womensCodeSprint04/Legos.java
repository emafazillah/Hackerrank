package womensCodeSprint04;

import java.util.Scanner;

public class Legos {

	static int productOfLegoTypes(int a, int b, int c, int d, int p, int q) {
		int count_p = 0;
		int count_q = 0;		
		int r = 0;
		int s = 0;
		int[] abcd = new int[4];
		abcd[0] = a;
		abcd[1] = b;
		abcd[2] = c;
		abcd[3] = d;
		for (int i = 0; i < abcd.length; i++) {
			if ( (abcd[i] != p && r == 0) && (abcd[i] != q && r == 0) ) 
				r = abcd[i];
			else if ( (abcd[i] != p && s == 0) && (abcd[i] != q && s == 0) ) 
				s = abcd[i];
			else if (abcd[i] == p || abcd[i] == q) {
				if (abcd[i] == p) count_p++;
				if (abcd[i] == q) count_q++;
			}
			System.out.println("r==="+r);
			System.out.println("s==="+s);
			System.out.println("count_p==="+count_p);
			System.out.println("count_q==="+count_q);			
		}
		if (r == 0 && count_p > 1) r = p;
		if (s == 0 && count_q > 1) s = q;
		if (r == 0 && s > 0) r = s;
		if (r > 0 && s == 0) s = r;
		System.out.println("r==="+r);
		System.out.println("s==="+s);		
		return r * s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			int p = in.nextInt();
			int q = in.nextInt();
			int answer = productOfLegoTypes(a, b, c, d, p, q);
			System.out.println(answer);
		}
		in.close();
	}

}
