package com.stackandqueue;

import java.util.LinkedList;

public class Queue {

	LinkedList<Integer> list = new LinkedList<Integer>();

	// enqueue internally calls add at last method
	public void enqueue(int data) {
		list.addLast(data);
	}
	
	public void dequeue() {
		list.removeFirst();
	}
	
	public void display() {
		System.out.println(list);
		
	}
	
}
