package com.passion2code.datastructures.hashtable;

/**
 * 
 * @author vamsid
 *
 * @param <T>
 * 
 *            This is my own implementation of Hash table data structure. This
 *            handles the collisions using "Open Addressing"
 */

public class MyHashTable<T> implements HashTable<T> {

	private T arr[];
	private int size = 0;
	private static final int CAPACITY = 10;

	@SuppressWarnings("unchecked")
	public MyHashTable() {
		arr = (T[]) new Object[CAPACITY];
	}

	@Override
	public void insert(T data) {

		// check array size
		if (size > (arr.length / 2)) {
			// auto - increment array size
			incrementAndCopy();
		}

		int index = hash(data); // get hash code for the data

		if (arr[index] == null) // if there is no collision
			arr[index] = data; // insert item
		else { // collision occurred
			index = getNextEmptyIndex(index); // find the next empty cell and insert
			if (index != -1)
				arr[index] = data;
			else
				System.err.println("Array is full. Cannot insert");
		}

		++this.size;
	}

	@Override
	public boolean find(T data) {
		int index = hash(data);

		if (arr[index].equals(data)) {
			return true;
		} else {
			while (index < arr.length) {
				if (arr[index].equals(data)) {
					return true;
				} else {
					++index;
				}
			}
		}
		return false;
	}

	@Override
	public boolean delete(T data) {

		int index = hash(data);

		if (arr[index].equals(data)) {
			arr[index] = null;
			return true;
		} else {
			while (index < arr.length) {
				if (!arr[index].equals(data))
					++index;
				else {
					arr[index] = null;
					return true;
				}
			}
		}
		--this.size;
		return false;
	}

	@Override
	public int hash(T data) {
		int hash = -1;

		if (data instanceof Integer) {
			hash = getHashInteger(data);
		} else if (data instanceof String) {
			hash = getHashForString(data);
		}

		return hash;
	}

	public void print() {
		for (T a : arr)
			System.out.print(a + " ");
		System.out.println();
	}

	private int getHashForString(T data) {

		String str = (String) data;
		char[] d = str.toCharArray();
		int count = 0;

		for (int i = 0; i < d.length; i++) {
			count += (int) d[i];
		}

		return count % arr.length;
	}

	private int getHashInteger(T data) {
		return (int) data % arr.length;
	}

	private int getNextEmptyIndex(int index) {

		while (index < this.arr.length) {
			if (this.arr[index] != null) {
				++index;
			} else {
				return index;
			}
		}
		return -1;
	}

	private void incrementAndCopy() {
		@SuppressWarnings("unchecked")
		T[] newArr = (T[]) new Object[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}

		this.arr = newArr;
	}

}
