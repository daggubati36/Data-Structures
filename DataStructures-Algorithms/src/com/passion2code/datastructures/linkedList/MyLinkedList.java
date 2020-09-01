package com.passion2code.datastructures.linkedList;

/**
 * This is my own implementation of Singly Linked List in Java
 * 
 * @author vamsid
 */

public class MyLinkedList<T> implements MyList<T> {
	private int size;
	private Node<T> root;

	@Override
	public void insert(T data) { // Insert at the beginning
		Node<T> newNode = new Node<>(data);

		if (this.size == 0) {
			this.root = newNode;
		} else {
			newNode.setNextNode(this.root);
			this.root = newNode;
		}

		++this.size;
	}

	public void insertLast(T data) {
		Node<T> current = this.root;
		Node<T> newNode = new Node<>(data);

		if (this.size == 0)
			this.root = newNode;
		else {
			while (current.getNextNode() != null)
				current = current.getNextNode();
			current.setNextNode(newNode);
		}

		++this.size;
	}

	@Override
	public Object remove(T data) {
		Node<T> currentNode = this.root;
		Node<T> previousNode = this.root;
		Object elementToDelete = null;

		while (currentNode != null) {
			if (this.root.getData() == data) { // Is this root?
				elementToDelete = this.root.getData();
				this.root = this.root.getNextNode(); // If yes, remove root
				--this.size;
				break;
			} else if (currentNode.getData() == data) {
				elementToDelete = currentNode.getData();
				previousNode.setNextNode(currentNode.getNextNode());
				--this.size;
				break;
			} else {
				previousNode = currentNode;
				currentNode = currentNode.getNextNode();
			}
		}

		return elementToDelete;
	}

	@Override
	public boolean search(T data) {
		Node<T> currentNode = this.root;
		boolean found = false;

		while (currentNode != null) {
			if (currentNode.getData() == data) {
				found = true;
				break;
			} else {
				currentNode = currentNode.getNextNode();
			}
		}

		return found;
	}

	public Object getFirstNode() {
		return this.root.getData();
	}

	public void print() {
		Node<T> current = this.root;

		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNextNode();
		}

		System.out.println();
	}

	@Override
	public int size() {
		return this.size;
	}
}
