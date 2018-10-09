package implemetation;

import java.util.Scanner;

public class GradingStudent {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            if(grade<38){
            	System.out.println(grade);
            }else{
                if((grade%5)==0){
                    System.out.println(grade);
                }else{
                	int divideby5=grade/5;
                	int multiplyby5=divideby5*5;
                	int multiplyby5plus5=multiplyby5+5;
                	int diffmultiplyby5=grade-multiplyby5;
                	int diffmultiplyby5plus5=multiplyby5plus5-grade;
                	if(diffmultiplyby5>diffmultiplyby5plus5){
                		System.out.println(multiplyby5plus5);
                	}else{
                		System.out.println(grade);
                	}
                }            	
            }
        }
        in.close();
    }

}
