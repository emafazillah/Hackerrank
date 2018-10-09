package strings;

import java.util.Scanner;

public class MakingAnagrams {
	
	static int makingAnagrams(String s1, String s2){        
		char[] arrS1 = s1.toCharArray();
        char[] arrS2 = s2.toCharArray();
        int[] charsS1 = new int[26];
        int[] charsS2 = new int[26];
        int count = 0;
        // count first array
        for(int i = 0; i < arrS1.length; i++) charsS1[Character.getNumericValue(arrS1[i]) - 10]++;
        // count second array
        for(int i = 0; i < arrS2.length; i++) charsS2[Character.getNumericValue(arrS2[i]) - 10]++;
        // count delete
        for(int i = 0; i < 26; i++) if(charsS1[i] != charsS2[i]) count += Math.abs(charsS1[i] - charsS2[i]);
        return count;
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
		in.close();
	}

}
