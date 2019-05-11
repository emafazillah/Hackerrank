package com.hackerrank.practice.interviewPreparationKit.linkedLists;

import java.util.Scanner;

class NodeV1 {
	int data;
	NodeV1 next;

	NodeV1(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListsDetectACycleV1 {

	// Tak submit pakai code ni
	static boolean hasCycle(NodeV1 head) {
		if(head == null) {
			return false;
		} else {
			return true;
		}
	}
	
	static NodeV1 insert(NodeV1 node, int data) {
		if(node == null) {
			return new NodeV1(data);
		} else if (node.next == null) {
			node.next = new NodeV1(data);
		} else {
			insert(node.next, data);
		}
		return node;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // no. of input
		NodeV1 head = null;
		boolean result = false;
		while (n-- > 0) {
			head = insert(head, scan.nextInt());	
			result = hasCycle(head.next);
		}
		if (result == true) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
