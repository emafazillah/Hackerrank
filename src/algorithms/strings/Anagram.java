package strings;

import java.util.Scanner;

public class Anagram {
	
	static int anagram(String s){
		int result = -1;
        if(s.length() % 2 == 0) {
        	int count = 0;
        	String s1 = s.substring(0, s.length() / 2);
        	String s2 = s.substring(s.length() / 2, s.length());
        	char[] char_s1 = s1.toCharArray();
        	for(char e : char_s1) {
        		int i = s2.indexOf(e);
        		if(i == -1) 
        			count++;
        		else 
        			s2 = s2.substring(0, i) + s2.substring(i + 1);
        	}
        	result = count;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
        in.close();
    }

}
