package com.hackerrank.practice.dataStructures.linkedLists;

//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReverseALinkedList {
	
	static class SinglyLinkedListNode {
	    int data;
	    SinglyLinkedListNode next;
	    
		SinglyLinkedListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static class SinglyLinkedList {
        SinglyLinkedListNode head;
        SinglyLinkedListNode tail;

        SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
	
	static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }
	
	static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
		SinglyLinkedListNode node = head;
    	int count = 1;
    	
    	while(node.next != null) {
    		node = node.next;
    		++count;
    	}
    	
    	SinglyLinkedList nodeList = new SinglyLinkedList();
    	
    	while(count > 0) {
    		node = head;
    		
    		int innerCount = count;
    		while(innerCount > 1) {
    			node = node.next;
    			--innerCount;
    		}
    		
    		nodeList.insertNode(node.data);
    		
    		--count;
    	}
		
		return nodeList.head;
    }
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

            SinglyLinkedListNode llist1 = reverse(llist.head);

            printSinglyLinkedList(llist1, " ");
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}