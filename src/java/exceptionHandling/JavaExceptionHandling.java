package exceptionHandling;

import java.text.DecimalFormat;
import java.util.Scanner;

class MyCalculator {

	public MyCalculator() {
	}

	public String power(int n, int p) throws Exception {

		if ((n < 0) || (p < 0)) {
			throw new Exception("n and p should be non-negative");
		} else {

			double result = 0;
			double dn = Double.parseDouble(Integer.toString(n));
			double dp = Double.parseDouble(Integer.toString(p));
			result = Math.pow(dn, dp);
			DecimalFormat df = new DecimalFormat("###");

			return df.format(result);

		}
	}

}

public class JavaExceptionHandling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			MyCalculator my_calculator = new MyCalculator();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		in.close();
	}

}
