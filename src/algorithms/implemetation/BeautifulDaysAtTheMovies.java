package implemetation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int beautiful = 0;
        for(int count = i; count <= j; count++) {        	
        	int beforeReverse = count;
        	String str = Integer.toString(count);
        	char[] arr = str.toCharArray();
        	String strED = "";
        	int reverse = arr.length;
        	while(reverse > 0) {
        		strED = strED + arr[reverse - 1];
        		reverse--;
        	}
        	int afterReverse = Integer.parseInt(strED);
        	//System.out.println("beforeReverse==="+beforeReverse);
        	//System.out.println("afterReverse==="+afterReverse);
        	//System.out.println(Math.abs(beforeReverse - afterReverse));
        	if(Math.abs(beforeReverse - afterReverse) % k == 0) beautiful++;
        }
        System.out.println(beautiful);
        scan.close();
    }

}
