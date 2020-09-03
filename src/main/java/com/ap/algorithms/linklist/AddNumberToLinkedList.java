package com.ap.algorithms.linklist;

import com.ap.algorithms.linklist.util.Node;
import com.ap.algorithms.linklist.util.ReverseLinkedList;
import com.ap.algorithms.linklist.util.SinglyLinkList;

//Problem Statement: Add a number between 1 to 9 to a number represented as linked list 
public class AddNumberToLinkedList {
	// Algorithm
	// Reverse linkedlist
	// add number to be added and use carry field
	// reverse again

	public static Node addANumberToList(Node head, int numberToBeAdded) {
		head = ReverseLinkedList.reverseLinkedList(head);
		addNumber(head, numberToBeAdded);
		return ReverseLinkedList.reverseLinkedList(head);
	}

	private static void addNumber(Node head, int numberToBeAdded) {
		Node tempHead = head;
		int carry = numberToBeAdded;
		while (carry != 0 && tempHead != null) {
			int num = tempHead.getData();
			num = num + carry;
			tempHead.setData(num % 10);
			carry = num / 10;
						
			if (tempHead.next == null && carry != 0) {
				tempHead.next = new Node(carry);
				carry = 0;
			}
			tempHead = tempHead.next;
		}
	}

	public static void main(String... args) {
		SinglyLinkList linkedList = new SinglyLinkList();
		Node head = linkedList.append(9).append(9).append(9).append(9).append(9).build();
		linkedList.print();
		head = addANumberToList(head, 9);
		linkedList.print(head);
	}
}
