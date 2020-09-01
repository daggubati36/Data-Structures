package com.passion2code.datastructures.linkedList;

/**
 * This is my own implementation of Doubly Linked List
 *
 * @author vamsid
 */
public class DoublyLinkedList<T extends Comparable<T>> implements MyList<T> {
	private NodeV2<T> head;
	private int size;

	@Override
	public void insert(T data) { // insert at the beginning
		NodeV2<T> newNode = new NodeV2<>(data);
		if (this.size == 0)
			this.head = newNode;
		else {
			newNode.setNextNode(this.head);
			newNode.setPreviousNode(null);
			this.head.setPreviousNode(newNode);
			this.head = newNode;
		}
		++this.size;
	}

	public void insertLast(T data) {
		NodeV2<T> newNode = new NodeV2<>(data);
		NodeV2<T> current = this.head;

		if (this.size == 0)
			this.head = newNode;
		else {
			while (current.getNextNode() != null)
				current = current.getNextNode();

			newNode.setPreviousNode(current);
			current.setNextNode(newNode);
		}

		++this.size;
	}

	@Override
	public T remove(T data) {
		NodeV2<T> current = this.head;
		T result = null;

		// if data is head elementÏ
		if (current.getData().compareTo(data) == 0) {
			this.head = this.head.getNextNode();
		} else {
			while (current.getNextNode() != null) { // Middle nodes
				if (current.getData().compareTo(data) == 0) {
					result = current.getData();
					current.getNextNode().setPreviousNode(current.getPreviousNode());
					current.getPreviousNode().setNextNode(current.getNextNode());
					break;
				} else
					current = current.getNextNode();
			}
			if (current.getNextNode() == null && current.getData().compareTo(data) == 0) { // last node
				current.getPreviousNode().setNextNode(null);
			}
		}
		--this.size;
		return result;
	}

	@Override
	public boolean search(T data) {
		boolean result = false;
		NodeV2<T> current = this.head;

		while (current != null) {
			if (current.getData().compareTo(data) == 0) {
				result = true;
				break;
			} else
				current = current.getNextNode();
		}
		return result;
	}

	@Override
	public int size() {
		return this.size;
	}

	public void print() {
		NodeV2<T> node = this.head;
		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNextNode();
		}
	}

}
