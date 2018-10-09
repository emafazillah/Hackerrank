package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LuckBalance {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        List<Contest> contests = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Contest contest = new Contest();
            contest.setL(scan.nextInt());
            contest.setT(scan.nextInt());
            contests.add(contest);
        }
        Collections.sort(contests, new Comparator<Contest>() {
            public int compare(Contest c1, Contest c2) {
                return c2.getL() - c1.getL();
            }
        });
        int luck = 0;
        int count_luck = 0;
        for(int i = 0; i < n; i++) { 
            Contest contest = contests.get(i);
            luck += contest.getT();
            if(luck <= k) {                
                count_luck += contest.getL();
            } else {
                if(contest.getT() == 1) 
                    count_luck -= contest.getL();
                else 
                    count_luck += contest.getL();
            }            
        }
        System.out.println(count_luck);
        scan.close();
    }
    
    static class Contest {
        private int l = 0;
        private int t = 0;
        
        Contest() {};
        
        int getL() {
            return l;
        }
        
        void setL(int l) {
            this.l = l;
        }
        
        int getT() {
            return t;
        }
        
        void setT(int t) {
            this.t = t;
        }
    }

}
