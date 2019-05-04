package com.hackerrank.practice.thirtyDaysOfCodes;

import java.util.Scanner;

class NodeDay24 {
	int data;
	NodeDay24 next;

	NodeDay24(int d) {
		data = d;
		next = null;
	}

}

public class Day24 {

	public static NodeDay24 removeDuplicates(NodeDay24 head) {
		NodeDay24 node = head;
		NodeDay24 result = null;
		while (node.next != null) {
			if (node.next.data != node.data) {
				result = insert(result, node.data);
			}
			node = node.next;
		}
		result = insert(result, node.data);
		return result;
	}

	public static NodeDay24 insert(NodeDay24 head, int data) {
		NodeDay24 p = new NodeDay24(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			NodeDay24 start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(NodeDay24 head) {
		NodeDay24 start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		NodeDay24 head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
		sc.close();
	}

}
