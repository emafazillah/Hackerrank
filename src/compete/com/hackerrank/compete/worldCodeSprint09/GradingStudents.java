package com.hackerrank.compete.worldCodeSprint09;

import java.util.Scanner;

public class GradingStudents {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            if (grade > 37) {
                int mod = 5 - (grade % 5); 
                if ((mod > 0) && (mod < 3)) {
                    int newgrade = grade + mod;
                    System.out.println(newgrade);
                } else {
                    System.out.println(grade);
                }
            } else {
                System.out.println(grade);
            }
        }
    }

}
