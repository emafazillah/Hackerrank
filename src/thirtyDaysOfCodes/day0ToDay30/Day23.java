package day0ToDay30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class NodeDay23 {
	NodeDay23 left, right;
	int data;

	NodeDay23(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day23 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	static void levelOrder(NodeDay23 root) {
		Queue<NodeDay23> queue = new LinkedList();
		queue.add(root);

		while (!queue.isEmpty()) {
			NodeDay23 current = queue.remove();
			System.out.print(current.data + " ");
			if (current.left != null)
				queue.add(current.left);
			if (current.right != null)
				queue.add(current.right);
		}
	}

	public static NodeDay23 insert(NodeDay23 root, int data) {
		if (root == null) {
			return new NodeDay23(data);
		} else {
			NodeDay23 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		NodeDay23 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}

}
