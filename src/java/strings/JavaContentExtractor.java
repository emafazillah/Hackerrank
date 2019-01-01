package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaContentExtractor {
	
	private static final String HTML_TAG_PATTERN = "<(.+)>([^<]+)</\\1>";
	
	/**
	 * Reference from Hackerrank Discussion
	 * @param args
	 */
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	boolean isMatch = false;
			Pattern pattern = Pattern.compile(HTML_TAG_PATTERN);
          	Matcher matcher = pattern.matcher(line);
          	// Check if tag is valid
          	while (matcher.find()) {
          		System.out.println(matcher.group(2));
          		isMatch = true;
          	} 
          	if(!isMatch) {
          		System.out.println("None");
          	}
          	
			testCases--;
		}
		
		in.close();
	}
	
}
