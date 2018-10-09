package strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringCompare {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int n = scan.nextInt();
        
        char[] arr = input.toCharArray();
        int len = (arr.length - n) + 1;        
        String[] result = new String[len];
        for (int i = 0; i < len; i++) {
            String strresult = "";
            for (int j = 0; j < n; j++) {
                strresult = strresult + Character.toString(arr[i+j]);
            }
            result[i] = strresult;
        }
        Arrays.sort(result);
        System.out.println(result[0] + "\n" + result[len-1]);
        scan.close();
    }

}
