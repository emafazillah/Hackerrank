package com.hackerrank.practice.java.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
        	int x = s.nextInt();
        	int y = s.nextInt();
        	int result = x/y;
        	System.out.println(result);
        }catch(InputMismatchException errscanner){
        	System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException errresult){
        	System.out.println("java.lang.ArithmeticException: / by zero");
        }
        s.close();
    }

}
