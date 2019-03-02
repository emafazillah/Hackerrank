package dataStructures;

import java.util.Scanner;

public class PrintInReverse {
	
	static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */    
    static void reversePrint(SinglyLinkedListNode head) {
    	//SinglyLinkedList reverseSinglyLinkedList = new SinglyLinkedList();
    	SinglyLinkedListNode temp = head;
    	int count = 1;
    	
    	while(temp.next != null) {
    		temp = temp.next;
    		++count;
    	}
    	
    	while(count > 0) {
    		temp = head;
    		
    		int innerCount = count;
    		while(innerCount > 1) {
    			temp = temp.next;
    			--innerCount;
    		}
    		
    		//reverseSinglyLinkedList.insertNode(temp.data);
    		
    		System.out.println(temp.data);
    		
    		--count;
    	}
    	
    	//printSinglyLinkedList(reverseSinglyLinkedList.head, "\r\n");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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

            reversePrint(llist.head);
        }

        scanner.close();
    }

}
