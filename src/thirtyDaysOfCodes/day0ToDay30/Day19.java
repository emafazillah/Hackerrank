package day0ToDay30;

import java.util.LinkedList;
import java.util.Scanner;

interface AdvancedArithmetic19 {
	int divisorSum(int n);
}

class CalculatorDay19 implements AdvancedArithmetic19 {

	public CalculatorDay19() {
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

public class Day19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic19 myCalculator = new CalculatorDay19();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}

}
