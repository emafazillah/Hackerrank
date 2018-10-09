package implemetation;

import java.util.Scanner;

public class CountingValleys {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		String steps = scan.next();		
		int valley = 0; // count valley
		int level = 0; // below sea level or above sea level
        int prevLevel = 0;
		char[] arr = steps.toCharArray();
		for(int i = 0; i < no; i++) {
			String step = Character.toString(arr[i]);
			if(step.equalsIgnoreCase("U"))
				level++;
			else // "D"
				level--;
			if(i > 0) {
				if(level == 0 && prevLevel < 0) 
					valley++;
			}
            prevLevel = level;
		}
		System.out.println(valley);
		scan.close();
    }

}
