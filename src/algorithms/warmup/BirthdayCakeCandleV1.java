package warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BirthdayCakeCandleV1 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();            
        }
        List<Integer> heights = new ArrayList<>();
        for(int i=0;i<n;i++){
        	heights.add(height[i]);
        }
        Collections.sort(heights);
        Map<Integer, Integer> map = new HashMap<>();
        int count=1;
        for(int j=0;j<n;j++){
        	if(j>0){
        		if(heights.get(j-1)==heights.get(j)){
        			count++;        			
        		}else{
        			map.put(heights.get(j-1), count);
        			count=1;
        		}
        		if(j==(n-1)){
    				map.put(heights.get(j), count);
    			}
        	}
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        	System.out.println(entry.getKey()+"==="+entry.getValue());
        }
        in.close();
    }

}
