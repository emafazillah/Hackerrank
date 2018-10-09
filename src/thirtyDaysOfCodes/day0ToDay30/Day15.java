package day0ToDay30;

import java.util.Scanner;

class NodeDay15 {
	int data;
	NodeDay15 next;

	NodeDay15(int d) {
		data = d;
		next = null;
	}
}

public class Day15 {

	public static NodeDay15 insert(NodeDay15 head, int data) {
		if (head == null)
			return new NodeDay15(data);
		else if (head.next == null) {
			head.next = new NodeDay15(data);
		} else {
			insert(head.next, data);
		}

		return head;
	}

	public static void display(NodeDay15 head) {
		NodeDay15 start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		NodeDay15 head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}

}
