package implemetation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DesignerPdfViewer {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        char[] charword = word.toCharArray();
        String[] heights = new String[charword.length];
        for (int i = 0; i < charword.length; i++) {
            int idx = Character.getNumericValue(charword[i]) - 10;
            heights[i] = Integer.toString(h[idx]);
        }
        List<String> list = Arrays.asList(heights);
        Collections.sort(list);
        String m = (list.get(list.size()-1)).toString();
        int result = list.size() * Integer.parseInt(m);
        System.out.println(result);
        in.close();
    }

}
