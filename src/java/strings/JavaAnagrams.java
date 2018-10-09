package strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
	
	static boolean isAnagram(String a, String b) {        
        boolean result = false;
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        if (arrA.length == arrB.length) {
            int len = arrA.length;    
            String stringA = "";
            String stringB = "";
            for (int i = 0; i < len; i++) {
                stringA = stringA + (Character.toString(arrA[i])).toLowerCase();
                stringB = stringB + (Character.toString(arrB[i])).toLowerCase();
            }
            char[] arrSortedA = stringA.toCharArray();
            char[] arrSortedB = stringB.toCharArray();
            Arrays.sort(arrSortedA);
            Arrays.sort(arrSortedB);
            stringA = "";
            stringB = "";
            for (int i = 0; i < len; i++) {
                stringA = stringA + Character.toString(arrSortedA[i]);
                stringB = stringB + Character.toString(arrSortedB[i]);
            }       
            if (stringA.equalsIgnoreCase(stringB)) {
                result = true;
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
