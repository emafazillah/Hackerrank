package womensCodeSprint04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExtraSweetHashMap {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> hm_sv = new HashMap<>();
        for (int sv = 0; sv < n; sv++) {
        	hm_sv.put(sv, sv);
        }
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int l = in.nextInt();
            int r = in.nextInt();
            int sum_sv = 0;
            Map<Integer, Integer> hm_rm = new HashMap<>();
            for (int i = l; i <= r; i++) {
            	sum_sv += i;
            	hm_rm.put(i, i);
            }
            // extra left
            int el = l - 1;
            while (el >= 0) {
            	if (hm_sv.containsValue(el)) {
                	sum_sv += el;
                	hm_rm.put(el, el);
                	break;
            	}
            	el--;
            }
            // extra right
            int er = r + 1;
            while (er < n) {
            	if (hm_sv.containsValue(er)) {
                	sum_sv += er;
                	hm_rm.put(er, er);
                	break;
            	}
            	er++;
            }
            int ii = 0;
            for (Map.Entry<Integer, Integer> entry : hm_rm.entrySet()) {
            	System.out.println("hm_rm_key("+ii+")==="+entry.getKey());
            	System.out.println("hm_rm_value("+ii+")==="+entry.getValue());
            	hm_sv.remove(entry.getKey(), entry.getValue());
            	ii++;
            }            
            System.out.println(sum_sv);
        }
        in.close();
    }

}
