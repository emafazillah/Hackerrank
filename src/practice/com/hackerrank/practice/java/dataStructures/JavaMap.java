package com.hackerrank.practice.java.dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noofqueries = scan.nextInt();
		scan.nextLine();
		Map<String, String> maps = new HashMap<>();
		for (int i = 0; i < noofqueries; i++) {
			String name = scan.nextLine();
			String phone = scan.nextLine();
			maps.put(name, phone);
		}
		while (scan.hasNextLine()) {
			String name = scan.nextLine();
			//String result = "";
			if(maps.containsKey(name)){
				System.out.println(name+"="+maps.get(name));
			} else {
				System.out.println("Not found");
			}
		}
		scan.close();
	}

}
