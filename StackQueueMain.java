package com.stackandqueue;

public class StackQueueMain {

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.peek();
		stack.pop();
		stack.peek();
		stack.pop();
		stack.peek();
		stack.pop();
		stack.peek();
		
		Queue queue = new Queue();
		
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.display();
		queue.dequeue();
		queue.display();
	}


}
