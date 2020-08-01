package com.passion2code.datastructures.hashtable;

public interface HashTable<T> {

	public void insert(T data);

	public void get(T data);
	
	public boolean delete(T data);
	
	public int hash(T data);

}
