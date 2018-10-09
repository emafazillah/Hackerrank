package strings;

import java.util.Scanner;

public class AlternatingCharacters {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String[] arrinput = new String[input];
        int[] arrcount = new int[input];
        for (int i = 0; i < input; i++) {
            arrinput[i] = scan.next();
        }
        scan.close();
        
        for (int i = 0; i < input; i++) {
            char[] arrchar = arrinput[i].toCharArray();
            String check = "";
            String charresult = " ";
            int count = 0;                            
            for (int j = 0; j < arrchar.length; j++) {
                check = Character.toString(arrchar[j]);             
                if (!check.equalsIgnoreCase(charresult.substring(charresult.length() - 1))) {
                    charresult = charresult + check;
                } else {
                    count++;
                }
                arrcount[i] = count;                
            }
            System.out.println(arrcount[i]);            
        }
    }

}
