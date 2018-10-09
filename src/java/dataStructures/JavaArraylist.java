package dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int row=scan.nextInt();
		ArrayList<ArrayList<Integer>> arrays=new ArrayList<>();
		for(int i=0;i<row;i++){
			int col=scan.nextInt();
			ArrayList<Integer> array=new ArrayList<>();
			for(int j=0;j<col;j++){
				array.add(scan.nextInt());
			}
			arrays.add(array);
		}
		int queriesno=scan.nextInt();		
		for(int i=0;i<queriesno;i++){
			int x=scan.nextInt();
			int y=scan.nextInt();
			ArrayList<Integer> array=arrays.get(x-1);            
            int result=0;
            if((y-1)<array.size()){
                for(int j=0;j<array.size();j++){
                    if(array.contains(array.get(y-1))){
                        result=array.get(y-1);
                        break;
                    }                
                }
            }			
            if(result==0){
                System.out.println("ERROR!");
            }else{
                System.out.println(result);
            }
		}
		scan.close();
    }

}
