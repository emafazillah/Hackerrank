package com.hackerrank.practice.dataStructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
    	this.data = data;
    	this.left = null;
    	this.right = null;
    }
}

public class PreorderTraversal {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	static void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node current = queue.remove();
			//System.out.print(current.data + " ");
			if (current.left != null)
				queue.add(current.left);
			if (current.right != null)
				queue.add(current.right);
			System.out.print(current.data + " ");
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data); // root
		} else {
			Node cur;
			if(root.left == null) {
				cur = insert(root.left, data);
				root.left = cur;
			} else { // after that 
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
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
	
}
