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
	private final int CAPACITY = 10;

	@SuppressWarnings("unchecked")
	public MyHashTable() {
		arr = (T[]) new Object[CAPACITY];
	}

	@Override
	public void insert(T data) {

		// TODO check array size

		int index = hash(data); // get hash code for the data

		if (arr[index] != null) // if there is no collision
			arr[index] = data; // insert item
		else { // collision occurred
			index = getNextEmptyIndex(index); // find the next empty cell and insert
			arr[index] = data;
		}

		++this.size;
	}

	@Override
	public void get(T data) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean delete(T data) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return 0;
	}

}
