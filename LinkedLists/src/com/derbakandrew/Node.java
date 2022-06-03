package com.derbakandrew;

public class Node {

	private int data;
	private Node nextNode;
	
	
	// Create a node.
	public Node (int data) {
		this.data = data;
	}
	
	
	// Getters and Setters for the private attributes.
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return "Data: " + this.data;
	}
}
