package implemetation;

import java.util.Scanner;

public class Kangaroo {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt(); // kangaroo1 start
        int v1 = in.nextInt(); // kangaroo1 velocity
        int x2 = in.nextInt(); // kangaroo2 start
        int v2 = in.nextInt(); // kangaroo2 velocity
        if((x2>x1) && (v2>v1)){
            System.out.println("NO");
        }else if((x1>x2) && (v1>v2)){
            System.out.println("NO");
        }else if((x1!=x2) && (v1==v2)){
            System.out.println("NO");
        }else{
            if((x1-x2)%(v2-v1)==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        in.close();
    }

}
