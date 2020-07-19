package com.ap.algoritms.linklist.util;

public class SinglyLinkList {
	
	Node head;

	public SinglyLinkList append(Integer data) {
		if (head == null) {
			head = new Node(data);
			return this;
		}
		Node tail = head;

		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = new Node(data);
		return this;
	}

	public Node build() {
		return head;
	}

	public String print() {
		return print(head);
	}
	
	public String print(Node head) {
		StringBuilder sb = new StringBuilder();
		Node current = head;
		while (current != null) {
			sb.append(current).append("-->");
			current = current.next;
		}
		if (sb.length() >= 3) {
			sb.delete(sb.length() - 3, sb.length());
			// to remove --> from last node
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
}
