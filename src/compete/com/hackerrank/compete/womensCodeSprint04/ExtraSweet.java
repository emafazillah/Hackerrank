package com.hackerrank.compete.womensCodeSprint04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtraSweet {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr_sv = new ArrayList<>();
        for (int sv = 0; sv < n; sv++) {
        	arr_sv.add(sv);
        }
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int l = in.nextInt();
            int r = in.nextInt();
            int sum_sv = 0;
            List<Integer> arr_rm = new ArrayList<>();
            for (int i = l; i <= r; i++) {
            	sum_sv += i;
            	arr_rm.add(i);
            }
            // extra left
            int el = l - 1;
            while (el >= 0) {
            	if (arr_sv.contains(el)) {
                	sum_sv += el;
                	arr_rm.add(el);
                	break;
            	}
            	el--;
            }
            // extra right
            int er = r + 1;
            while (er < n) {
            	if (arr_sv.contains(er)) {
                	sum_sv += er;
                	arr_rm.add(er);
                	break;
            	}
            	er++;
            }
            for (int ii = 0; ii < arr_rm.size(); ii++) {
            	System.out.println("arr_rm("+ii+")==="+arr_rm.get(ii));
            }
            arr_sv.removeAll(arr_rm);
            System.out.println(sum_sv);
        }
        in.close();
    }

}
