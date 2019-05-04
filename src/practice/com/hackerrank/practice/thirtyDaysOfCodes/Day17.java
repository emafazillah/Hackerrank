package com.hackerrank.practice.thirtyDaysOfCodes;

import java.util.Scanner;

class CalculatorDay17 {

	public CalculatorDay17() {

	}

	public int power(int n, int p) throws Exception {
		if ((n < 0) || (p < 0)) {
			throw new Exception("n and p should be non-negative");
		} else {
			double ans = Math.pow(Double.parseDouble(Integer.toString(n)), Double.parseDouble(Integer.toString(p)));
			int result = (int) ans;
			return result;
		}
	}
}

public class Day17 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt();
			int p = in.nextInt();
			CalculatorDay17 myCalculator = new CalculatorDay17();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}

}
