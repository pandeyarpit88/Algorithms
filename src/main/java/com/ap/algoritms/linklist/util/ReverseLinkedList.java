package com.ap.algoritms.linklist.util;

public class ReverseLinkedList {

	public static Node reverseLinkedList(Node node) {
		Node newHead;
		if(node.next == null)
			return node;
		newHead = reverseLinkedList(node.next);
		node.next.next = node;
		node.next = null;
		return newHead;
	}

	public static void main(String... args) {
		SinglyLinkList linkedList = new SinglyLinkList();
		Node head = linkedList.append(20).append(30).append(40).append(50).build();
		linkedList.print();
		Node newHead = ReverseLinkedList.reverseLinkedList(head);
		linkedList.print(newHead);
	}
}
