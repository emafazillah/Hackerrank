package day0ToDay30;

import java.util.LinkedList;
import java.util.Scanner;

interface AdvancedArithmeticDay18 {
	int divisorSum(int n);
}

class CalculatorDay18 implements AdvancedArithmeticDay18 {

	public CalculatorDay18() {
	}

	public int divisorSum(int no) {
		int count = 1;
		int result = 0;
		LinkedList numbers = new LinkedList();
		while (count <= no) {
			if ((no % count) == 0) {
				numbers.add(count);
			}
			count++;
		}

		for (int i = 0; i < numbers.size(); i++) {
			result = result + (int) numbers.get(i);
		}
		return result;
	}
}

public class Day18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmeticDay18 myCalculator = new CalculatorDay18();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}

}
