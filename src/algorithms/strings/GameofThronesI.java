package strings;

import java.util.Scanner;

public class GameofThronesI {
	
	static String gameOfThrones(String s){
        String result = "NO";
        // is anagram a palindrome or not
        int[] ints = new int[26]; // a-z
        char[] chars = s.toCharArray();
        // a = 10, b = 11, c = 12 ...
        for(int i = 0; i < chars.length; i++) ints[Character.getNumericValue(chars[i]) - 10]++;
        int count_even = 0;
        int count_odd = 0;
        for(int j = 0; j < 26; j++) {
        	//System.out.println(Character.getName(j+97)+"==="+ints[j]);
        	if(ints[j] > 0) {
        		if(ints[j] % 2 == 0) 
            		count_even++;
            	else 
            		count_odd++;            	
        	}        	
        }
        //System.out.println("count_even==="+count_even);
        //System.out.println("count_odd==="+count_odd);
        if (count_odd < 2 && count_even > 0) result = "YES";
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
        in.close();
    }

}
