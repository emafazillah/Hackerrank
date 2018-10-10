package worldCodeSprint11;

import java.util.Scanner;

public class NumericString2 {
	
	// Score 13.50
	static int getMagicNumber(String s, int k, int b, int m){
		int result = 0;
        int start = 0;
        int size = s.length();                
        while(size - (start + k) >= 0) {    		
    		int last = start + k;
    		String ss = s.substring(start, last);
    		int b3tob10 = Integer.parseInt(ss, b);
			int modM = b3tob10 % m;
			result += modM;
        	start++;
        }
        return result;
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int result = getMagicNumber(s, k, b, m);
        System.out.println(result);
    }

}
