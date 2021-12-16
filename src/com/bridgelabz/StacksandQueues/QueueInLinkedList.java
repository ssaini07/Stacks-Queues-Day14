package com.bridgelabz.StacksandQueues;

/*
 * Queue implementation using Linked List
 */
public class QueueInLinkedList<T> {
	private Node<T> front;
	private Node<T> rear;
	private int length;

	private static class Node<T> {
		T data;
		Node<T> next;

		// Creating constructor of class Node here to pass values.
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	// Function to add elements in the Queue using enQueue method.

	public void enQueue(int data) {
		Node newNode = new Node(data);
		if (front == null) {
			rear = newNode;
			front = rear;
		} else {
			rear.next = newNode;
			rear = rear.next;
		}
		length++;
	}

	// Here this method will return the size of the list.

	public int size() {
		return length;
	}

	// Function to display elements in the Queue using show method.

	public void show() {
		Node currNode = front;
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Queue");
		QueueInLinkedList queue = new QueueInLinkedList();
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		System.out.println("Size of the queue " + queue.size());
		queue.show();
	}

}
