package com.passion2code.datastructures.arrayList;

public interface MyList<T> {
	public void add(T data);

	public Object get(int index);

	public int size();

	public Object remove(int index);
}