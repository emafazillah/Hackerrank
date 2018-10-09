package day0ToDay30;

import java.util.Scanner;

public class Day06 {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int inputcount = scan.nextInt();
        String[] arrinput = new String[inputcount];
        for (int i = 0; i < inputcount; i++) {
            arrinput[i] = scan.next();
        }
        scan.close();
        
        for (int i = 0; i < inputcount; i++) {
            String inputstring = arrinput[i];
            char[] arrchar = inputstring.toCharArray();
            String even = "";
            String odd = "";
            String result = "";
            for (int j = 0; j < arrchar.length; j++) {
                if ((j % 2) == 0) {
                    // even
                    even = even + Character.toString(arrchar[j]);
                } else {
                    // odd
                    odd = odd + Character.toString(arrchar[j]);
                }
            }
            
            result = even + " " + odd;
            System.out.println(result);
        }
    }

}
