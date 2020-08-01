package com.passion2code.datastructures.hashtable;

public class HashTableApp {
	public static void main(String[] args) {
		MyHashTable<String> hTable = new MyHashTable<>();
		
		hTable.insert("Vamsi");
		hTable.insert("Daggubati");
		hTable.insert("Likhit");
		hTable.insert("Hyma");
		hTable.insert("Phani");
		hTable.insert("Coding");
//		hTable.insert("Problems");
		
		hTable.print();
		
		System.out.println(hTable.find("Coding"));
		
//		System.out.println(hTable.delete(""));
		
//		hTable.print();
		
	}
}
