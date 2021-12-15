package com.bridgelabz.StacksQueues;

import com.bridgelabz.StacksQueues.stackUsingLinkedList;

public class stackUsingLinkedList {
	// A linked list node
	Node top;

	private class Node {

		int data; // integer data
		Node next; // reference variable Node type
	}

	// Constructor

	stackUsingLinkedList() {
		this.top = null;
	}

	// function to check if the stack is empty or not..

	public boolean isEmpty() {
		return top == null;
	}

	// function to add element

	@SuppressWarnings("unused")
	public void push(int data) {
		Node newNode = new Node();

		if (newNode == null) {
			System.out.println("Linklist is empty");
			return;
		}
		newNode.data = data;
		newNode.next = top;
		top = newNode;

	}

	// function to pop element in the stack
	@SuppressWarnings("unused")
	public void pop(int data) {

		if (top == null) {
			System.out.println("Linklist is empty");
			return;
		} else {
			top = top.next;
		}
	}

	// Function to perform peek operation

	public int peek() {
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	// function to display the list

	public void display() {
		// check for stack underflow
		if (top == null) {
			System.out.printf("Linklist is empty");
			return;
		} else {
			Node temp = top;
			while (temp != null) {
				System.out.println(temp.data + "->");
				temp = temp.next;

			}
			System.out.println("Null");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stacks and Queues");
		// creating object Implementing class
		stackUsingLinkedList list = new stackUsingLinkedList();
		list.push(70);
		list.push(30);
		list.push(56);
		System.out.println("List after push operation");
		list.display();
		list.pop(70);
		list.pop(30);
		list.pop(56);
		System.out.println("List after pop operation");
		list.display();
		list.peek();
	}
}
