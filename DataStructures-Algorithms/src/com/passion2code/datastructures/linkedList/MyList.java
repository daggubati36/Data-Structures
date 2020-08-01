package com.passion2code.datastructures.linkedList;

public interface MyList<T> {
    public void insert(T data);

    public Object remove(T data);

    public boolean search(T data);

    public int size();
}
