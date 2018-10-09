package introduction;

import java.util.Scanner;

public class JavaEndOfFile {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (scan.hasNext()) {
            count++;
            String result = scan.nextLine();
            System.out.println(Integer.toString(count) + " " + result);
        }
        scan.close();
    }

}
