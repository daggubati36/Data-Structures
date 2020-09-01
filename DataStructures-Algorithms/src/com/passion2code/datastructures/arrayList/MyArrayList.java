package com.passion2code.datastructures.arrayList;

import java.util.Arrays;

/**
 * This is my own implementation of Java's "ArrayList". I am building this Data
 * Structure from Scratch
 */

public class MyArrayList<T> implements MyList<T> {
	private int size;
	private final int DEFAULT_CAPACITY = 10;
	private Object arr[];

	// Define default constructor
	public MyArrayList() {
		this.arr = new Object[DEFAULT_CAPACITY];
	}

	// Define constructor with capacity
	public MyArrayList(int capacity) {
		this.arr = new Object[capacity];
	}

	@Override
	public void add(T data) {
		// Check if array is full
		if (this.size == arr.length) { // If array is indeed full
			increaseSize(); // Increase the capacity of Array
		}

		arr[this.size] = data; // Insert data
		++this.size; // Increase the size of Array
	}

	@Override
	public Object get(int index) {
		if (index >= 0 && index < this.arr.length)
			return this.arr[index];
		else
			return null;
	}

	@Override
	public int size() { // Return how many elements are filled
		return this.size;
	}

	@Override
	public Object remove(int index) {
		Object elementAtIndex = null;

		if (index < size) {
			int i = index;
			elementAtIndex = arr[index];
			while (i < arr.length - 1) {
				arr[i] = arr[++i];
			}
			--this.size;
		} else {
			throw new IllegalArgumentException();
		}

		return elementAtIndex;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private void increaseSize() {
		int currentSize = arr.length;
		int newSize = currentSize + (currentSize / 2);
		arr = copyWithNewSize(arr, newSize);
	}

	private Object[] copyWithNewSize(Object[] arr, int newSize) {
		return Arrays.copyOf(arr, newSize);
	}
}
