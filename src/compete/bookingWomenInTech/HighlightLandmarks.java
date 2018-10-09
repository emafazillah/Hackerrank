package bookingWomenInTech;

import java.util.Scanner;

public class HighlightLandmarks {
	
	public static void main(String[] args) throws Exception {		
		Scanner scan = new Scanner(System.in);	
		String D = ""; // String: Description
        while(!scan.hasNextInt()){
            D = D + scan.next() + " ";
        }
		int L = scan.nextInt(); // int: Number of landmark
		String[] n = new String[L]; // String: space-seperated list n of landmark
		for(int i=0;i<L;i++) {
			n[i] = scan.next(); 
			D = D.replaceAll("\\b"+n[i]+"\\b", "<b>"+n[i]+"</b>"); // to resolve plural words & words that contain landmark name
		}
		D = D.trim();
		System.out.println(D);
	}

}
