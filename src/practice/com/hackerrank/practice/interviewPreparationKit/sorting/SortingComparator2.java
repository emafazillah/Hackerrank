package com.hackerrank.practice.interviewPreparationKit.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingComparator2 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
		Integer scoreA = a.score;
		Integer scoreB = b.score;
		if(scoreA.compareTo(scoreB) == 0) {
			String nameA = a.name;
			String nameB = b.name;
			return nameA.compareTo(nameB);
		} else {
			return scoreB.compareTo(scoreA);
		}
    }
}
