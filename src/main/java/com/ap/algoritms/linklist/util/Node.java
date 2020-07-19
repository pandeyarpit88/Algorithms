package com.ap.algoritms.linklist.util;

public class Node {
	public Node next = null;
	private Integer data;

	public Node(Integer data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return data.toString();
	}
}
