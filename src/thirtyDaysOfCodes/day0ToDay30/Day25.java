package day0ToDay30;

import java.util.Scanner;

public class Day25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int[] inputs = new int[count];
		for (int i = 0; i < count; i++) {
			inputs[i] = s.nextInt();
		}

		int input = 0;
		int check = 0;
		boolean isPrime = true;
		for (int a = 0; a < count; a++) {
			input = inputs[a];
			check = 0;
			isPrime = true;
			if (input < 2) {
				isPrime = false;
			} else {
				// for (int b = 2; b <= input/2; b++) {
				for (int b = 2; b * b <= input; b++) {
					check = input % b;
					if (check == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}
		s.close();
	}

}
