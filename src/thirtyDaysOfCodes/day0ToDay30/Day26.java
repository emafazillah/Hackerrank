package day0ToDay30;

import java.util.Scanner;

public class Day26 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String dda = leadingzero(s.next(), 2);
		String mma = leadingzero(s.next(), 2);
		String yya = leadingzero(s.next(), 4);
		String dde = leadingzero(s.next(), 2);
		String mme = leadingzero(s.next(), 2);
		String yye = leadingzero(s.next(), 4);

		String yyyymmdda = yya + mma + dda;
		String yyyymmdde = yye + mme + dde;

		int result = 0;

		if (Integer.parseInt(yyyymmdda) > Integer.parseInt(yyyymmdde)) {
			if (isActualGreater(yya, yye)) {
				result = 10000;
			} else {
				if (isActualGreater(mma, mme)) {
					result = Math.abs(Integer.parseInt(mma) - Integer.parseInt(mme)) * 500;
				} else {
					if (isActualGreater(dda, dde)) {
						result = Math.abs(Integer.parseInt(dda) - Integer.parseInt(dde)) * 15;
					}
				}
			}
		}

		System.out.println(result);
		s.close();
	}

	public static String leadingzero(String input, int maxlen) {
		String result = input;
		if (input.length() < maxlen) {
			int zeros = maxlen - input.length();
			for (int i = 0; i < zeros; i++) {
				result = "0" + result;
			}
		}
		return result;
	}

	public static boolean isActualGreater(String actual, String expected) {
		boolean result = false;
		int a = Integer.parseInt(actual);
		int e = Integer.parseInt(expected);
		if (a > e) {
			result = true;
		}
		return result;
	}

}
