package strings;

import java.util.Scanner;

public class HackerrankInAString {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();        
            char[] arr = s.toCharArray();
            String findMe = "hackerrank";            
            int count = 0;
            for(int i = 0; i < arr.length; i++) {
            	CharSequence subs = findMe.substring(count, count + 1);
            	if(Character.toString(arr[i]).equals(subs.toString())) count++;
            	if(count == findMe.length()) 
            		break;
            }
            if(count == findMe.length()) 
            	System.out.println("YES");
            else 
            	System.out.println("NO");
        }
		in.close();
	}

}
