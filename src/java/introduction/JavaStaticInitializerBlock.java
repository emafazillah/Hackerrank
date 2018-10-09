package introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	public static int B;
	public static int H;
	public static boolean flag = isFlag();

	private static boolean isFlag() {
		boolean f = false;

		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			f = true;
		}
		scan.close();
		
		return f;
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}
