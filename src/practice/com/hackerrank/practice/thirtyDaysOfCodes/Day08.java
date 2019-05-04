package com.hackerrank.practice.thirtyDaysOfCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08 {
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, String> phoneBook = new HashMap<String, String>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, Integer.toString(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            //for (int j = 0; j < n; j++) {
                if (phoneBook.containsKey(s)) {
                    System.out.println(s + "=" + phoneBook.get(s));
                } else {
                    System.out.println("Not found");
                }
            //}
        }
        in.close();
    }

}
