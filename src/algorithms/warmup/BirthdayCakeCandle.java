package warmup;

import java.util.Scanner;

public class BirthdayCakeCandle {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int count = 0;
        int test = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height_i==0){
            	test=height[height_i];
        		count++;        		
        	}else{
        		if(height[height_i]==test){
        			count++;
        		}else if(height[height_i]>test){
        			test=height[height_i];
        			count=1;
        		}
        	}
        }
        System.out.println(count);
        in.close();
    }

}
