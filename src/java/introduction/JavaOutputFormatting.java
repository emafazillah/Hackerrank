package introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();

			String strresult = "";
			char[] charresult = s1.toCharArray();
			for (int j = 0; j < 15; j++) {
				if (j < charresult.length) {
					strresult = strresult + charresult[j];
				} else {
					strresult = strresult + " ";
				}
			}

			String strinteger = "";
			String strx = Integer.toString(x);
			if (strx.length() == 2) {
				strinteger = "0" + strx;
			} else if (strx.length() == 1) {
				strinteger = "00" + strx;
			} else if (strx.length() == 0) {
				strinteger = "000";
			} else {
				strinteger = strx;
			}

			System.out.println(strresult + strinteger);
		}
		System.out.println("================================");
		sc.close();
	}

}
