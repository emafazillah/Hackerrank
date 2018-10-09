package worldCodeSprint08;

import java.util.Scanner;

public class SnakeCase {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] arr = s.toCharArray();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if ("_".equalsIgnoreCase(Character.toString(arr[i]))) {
                count++;
            }
        }
        System.out.println(count);
    }

}
