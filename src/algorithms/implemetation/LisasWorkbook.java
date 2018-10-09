package implemetation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LisasWorkbook {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int next_page = 1;        
        List<Map<Integer, Integer>> workbooks = new ArrayList<>(); // Map<Page no., Question no.>
        for(int i = 0; i < n; i++) {
            int curr_page = 0;
            for(int j = 1; j <= arr[i]; j++) {
                if(j % k == 0) {
                    curr_page = next_page + (j / k) - 1;
                } else {
                    curr_page = next_page + (j / k);
                }                
                Map<Integer, Integer> workbook = new HashMap<>();
                workbook.put(curr_page, j);
                workbooks.add(workbook);
            }
            next_page = curr_page + 1;
        }
        int count_special = 0;
        for(int i = 0; i < workbooks.size(); i++) {
            Map<Integer, Integer> workbook = workbooks.get(i);
            for(Map.Entry<Integer, Integer> entry : workbook.entrySet()) {
                if(entry.getKey() == entry.getValue()) count_special++;
            }    
        }
        System.out.println(count_special);
        scan.close();
    }

}
