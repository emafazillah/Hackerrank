package com.hackerrank.practice.java.objectOrientedProgramming;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

	public MyCalculator() {
	}

	@Override
	public int divisor_sum(int n) {
		int result = 0;
		int count = 1;
		while (count <= n) {
			if ((n % count) == 0) {
				result += count;
			}
			count++;
		}
		return result;
	}

}

public class JavaInterface {

	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}

	/*
	 * ImplementedInterfaceNames method takes an object and prints the name of
	 * the interfaces it implemented
	 */
	@SuppressWarnings("rawtypes")
	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}

}
