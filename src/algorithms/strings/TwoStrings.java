package strings;

import java.util.Scanner;

public class TwoStrings {
	
	static String twoStrings(String s1, String s2){
        int[] int_s1 = new int[26]; // a-z
        int[] int_s2 = new int[26]; // a-z
        char[] char_s1 = s1.toCharArray();
        char[] char_s2 = s2.toCharArray();
        for(int i = 0; i < char_s1.length; i++) int_s1[Character.getNumericValue(char_s1[i]) - 10]++;
        for(int i = 0; i < char_s2.length; i++) int_s2[Character.getNumericValue(char_s2[i]) - 10]++;
        int count = 0;
        for(int i = 0; i < 26; i++) if(int_s1[i] > 0 && int_s2[i] > 0) count++;
        if(count > 0) 
        	return "YES";
        else 
        	return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
        in.close();
    }

}
