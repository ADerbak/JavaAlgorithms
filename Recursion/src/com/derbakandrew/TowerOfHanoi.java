package com.derbakandrew;

import java.lang.reflect.Array;

public class TowerOfHanoi {
	
	// Need to create 3 stacks = A, B, C
	// N numbers on A (e.g. 3 would be 1,2,3, Null)
	
	public void move(int numberOfDiscs, char from, char to, char inter) {
	
		// Create a move (number of disks, from stack, to stack, using stack)
		
		
		// Get "from stack's" head
		// peek at "to stack's" and "using stack's" heads
		// make sure the value isn't greater than the stack's head values
		
		if (numberOfDiscs == 1) {
			System.out.println("Moving Disc 1 from " + from + " to " + to);
		} else {
		move(numberOfDiscs - 1, from, inter, to);
		System.out.println("Moving disc " + numberOfDiscs + " from " + from + " to " + to);
		move(numberOfDiscs - 1, inter, to, from);
		}
		
	}
		// e.g.
		public static void main(String[] args) {
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.move(4, 'A','C','B');
		
		// This will print out the sequence of steps needed to move the disks to each location
		
	}
	
	// Create a recursive call that calls the move until stack C has all the values and
	// stack A/B are empty

}
