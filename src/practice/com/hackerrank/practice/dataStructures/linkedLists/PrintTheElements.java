package com.hackerrank.practice.dataStructures.linkedLists;

import java.util.Scanner;

class Node01 {
	/*
	 * Start Node is Head End Node is determine by address 0
	 */
	int data; // current Node's data
	Node01 next; // address of next Node

	public Node01(int data) {
		this.data = data;
		this.next = null;
	}

}

public class PrintTheElements {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Node01 head = null; 
		if(scan.hasNextLine()) {
			int n = scan.nextInt(); // No. of nodes		
			for(int i = 0; i < n; i++){
				int element = scan.nextInt();
				head = insert(element, head);
			}
		}		
		display(head);
	}

	static Node01 insert(int data, Node01 head) {
		if (head == null) {
			return new Node01(data);
		} else if (head.next == null) {
			head.next = new Node01(data);
		} else {
			insert(data, head.next);
		}
		return head;
	}

	static void display(Node01 head) { // Print
		Node01 start = head;
		while(start != null) {
			System.out.println(start.data);
			start = start.next;
		}
	}

}
