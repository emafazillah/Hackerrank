package com.hackerrank.compete.womensCodeSprint03;

import java.util.Scanner;

public class AsciiFlower {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int row=r*3;
        for(int i=0;i<row;i++){
        	StringBuilder result = new StringBuilder();
        	for(int j=0;j<c;j++){
                int test=i+1;
                if((test%3)==2){
                    String sEven="O.o.O";
                    char[] cEven=sEven.toCharArray();
                    result.append(cEven);
                }else{
                    String sOdd="..O..";
                    char[] cOdd=sOdd.toCharArray();
                    result.append(cOdd);
                }
        	}
        	System.out.println(result.toString());
        }
    }

}
