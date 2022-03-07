package data_structures;

import common.List;

class Node<T> {
	Node<T> next = null;
	T value = null;

	public Node(T val) {
		value = val;
	}
}

public class LinkedList<T> implements List<T> {
	Node<T> head = null;
	Node<T> tail = null;
	int len = 0;

	public int length() {
		return len;
	}
	
	Node<T> getNode(int index) {
		Node<T> node = head;
		int i = 0;
		while (i < index) {
			node = node.next;
			i++;
		}
		return node;
	}
	 
	public T getItem(int index) {
		Node<T> node = getNode(index);
		return node.value;
	}
	
	public void setItem(int index, T item) {
		Node<T> node = getNode(index);
		node.value = item;
	}

	public void append(T item) {
		if (head == null) {
			head = new Node<T>(item);
			tail = head;
		} else {
			tail.next = new Node<T>(item);
			tail = tail.next;
		}
		len += 1;
	}
}
