package com.hackerrank.practice.crackingTheCodingInterview.dataStructures;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListsDetectACycle {

	// Cycle detection using "tortoise and hare" algorithm
	// Submit hasCycle only
	static boolean hasCycle(Node head) {
		Node hare = head;
	    Node tortoise = head;
	    do {
	        if((hare == null) || (hare.next == null)) {
	            return false;
	        } else {
	            hare = hare.next.next;
	            tortoise = tortoise.next;
	        }
	    } while(hare != tortoise);
	    return true;
	}	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // input
		// Dummy...
		Node head = new Node(n);
		boolean result = false;
		result = hasCycle(head);
		if (result == true) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
