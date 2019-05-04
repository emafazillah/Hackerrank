package com.hackerrank.practice.crackingTheCodingInterview.interviewPreparationKit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortingComparator {
	
	public static void main(String...strings) {
		Scanner scanner = new Scanner(System.in);
		
		int countInput = scanner.nextInt();
		
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		// Store into a list, players
        List<Player1> players = new ArrayList<>();
		for(int i = 0; i < countInput; i++) {
			String[] input = scanner.nextLine().split(" ");
			Player1 player = new Player1(input[0], Integer.parseInt(input[1]));
			players.add(player);
		}
        
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        // Sort and compare
		Collections.sort(players, new Checker1());
		
		// Print result
		for(int i = 0; i < countInput; i++) {
			System.out.println(players.get(i).getName() + " " + players.get(i).getScore());
		}
        
		scanner.close();
	}

}

class Player1 {
	String name = "";
	Integer score = 0;
	
	public Player1() {
		
	}

	public Player1(String name, Integer score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
}

class Checker1 implements Comparator<Player1> {
	public int compare(Player1 a, Player1 b) {
		if(b.getScore().compareTo(a.getScore()) == 0) {
			return a.getName().compareTo(b.getName());
		} else {
			return b.getScore().compareTo(a.getScore());
		}
	}
}
