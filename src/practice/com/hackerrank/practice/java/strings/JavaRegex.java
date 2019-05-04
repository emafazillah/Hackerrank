package com.hackerrank.practice.java.strings;

import java.util.Scanner;

public class JavaRegex {
	
	public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }

}

class MyRegex {
    //String pattern = "(\\d){1,3}(.)(\\d){1,3}(.)(\\d){1,3}(.)(\\d){1,3}";
    String p = "(\\d{1}|\\d{2}|0[0-9]{2}|1[0-9]{2}|2[0-5]{2})";
    String pattern = p + "(.)" + p + "(.)" + p + "(.)" + p;
}
