package com.ap.algoritms.linklist;

import com.ap.algoritms.linklist.util.Node;
import com.ap.algoritms.linklist.util.ReverseLinkedList;
import com.ap.algoritms.linklist.util.SinglyLinkList;

//Problem Statement: Add 1 to a number represented as linked list 
public class AddOneToLinkedList {
	// Algorithm
	// Reverse linklist
	// add one and use carry field
	// reverse again

	public static Node addOneToList(Node head) {
		head = ReverseLinkedList.reverseLinkedList(head);
		Node tempHead = head;
		int carry = 1;
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
		return ReverseLinkedList.reverseLinkedList(head);
	}

	public static void main(String... args) {
		SinglyLinkList linkedList = new SinglyLinkList();
		Node head = linkedList.append(1).append(9).append(9).append(9).append(9).build();
		linkedList.print();
		head = addOneToList(head);
		linkedList.print(head);
	}
}
