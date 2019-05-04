package com.hackerrank.practice.algorithm.implemetation;

import java.util.Scanner;

public class DayOfTheProgrammer {
	
	static String solve(int year){
        String result = "";
        if(year >= 1700 && year < 1918) { // Julian
        	if((year - 1700) % 4 == 0)
                result = "12.09.";
            else
                result = "13.09." ;
        } else if(year > 1918) { // Gregorian
        	if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                result = "12.09.";
            else
                result = "13.09." ;
        } else { // 1918, transition
        	int day = 13;
        	if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                day += 12;
            else
                day += 13;
        	result = Integer.toString(day) + ".09.";
        }        
        return result += Integer.toString(year);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
        in.close();
    }

}
