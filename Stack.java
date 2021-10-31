package com.stackandqueue;

import java.util.LinkedList;

public class Stack {

	LinkedList<Integer> list = new LinkedList<Integer>();

	// push method internally calling Add method
	public void push(int data) {
		list.add(data);  // adding new data to linkedlist
		
	}
	
	public void peek() {
		System.out.println(list.peek()); // displays top element of linkedlist
	} 
	
	
	public void pop() {
		list.pop();  // delete top element of linkedlist
	}
}
