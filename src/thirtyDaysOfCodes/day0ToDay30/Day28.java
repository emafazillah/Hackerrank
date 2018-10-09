package day0ToDay30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28 {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        String mypattern = "@gmail.com";
        List<String> results = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            String firstname = s.next();
            String emailid = s.next();
            Pattern pattern = Pattern.compile(mypattern);
            Matcher matcher = pattern.matcher(emailid);
            if (matcher.find()) {
                results.add(firstname);
            }
        }
        Collections.sort(results);
        for (String result : results) {
            System.out.println(result);
        }
        s.close();
    }

}
