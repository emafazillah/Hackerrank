package strings;

import java.util.Scanner;

public class SeparateTheNumbers {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();            
        	if(s.length() > 1) {        		
        		int len = 1;    			
        		int start_curr = 0;
        		int start_next = 0;
        		int curr = 0;
        		int next = 0;
    			while((next != curr + 1) && (start_next + len < s.length())) {
        			System.out.println("==="+start_curr+"===");
        			curr = Integer.parseInt(s.substring(start_curr, start_curr + len));
        			System.out.print("curr==="+curr+" ");
        			String s_max = "";
        			for(int i = 0; i < len; i++) s_max += "9";
        			int i_max = Integer.parseInt(s_max);
        			System.out.print("i_max==="+i_max+" ");
        			start_next = start_curr + len;
        			if(curr == i_max) len++;        			
        			next = Integer.parseInt(s.substring(start_next, start_next + len));
        			System.out.print("next==="+next+" "); 
        			start_curr++;
        			System.out.println();
        		}
        	} else {
        		System.out.println("NO");
        	}
        }
        in.close();
    }

}
