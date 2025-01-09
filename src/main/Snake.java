/*
 

Snake object: snake's body (Point objects), method to grow and move

*/

package main;

import java.awt.*;
import java.util.LinkedList;

public class Snake {
	
	private LinkedList<Point> body; // Snake's Body using LinkedList
	private int direction; // Snake direction (Passes to Game.java where it is updated on game board)
	private final int SIZE = 10; // Each snake segment = amount of pixels specified
	
	public void Move() {
		
	}
	
	public void Grow() {
		
	}
	
	public Snake() {
		body = new LinkedList<>();
		body.add(new Point(50, 50)); // Snake head start position
		body.add(new Point(40, 50)); // First segment after head
		body.add(new Point(30, 50)); // Second segment after head
		
		direction = 1; // 0 = up, 1 = right, 2 = down, 3 = left)
	}
	
	// Move snake in direction by adding head segment and removing last body segment
	public void move() {
		Point head = body.getHead(); // Get current snake head
		Point newHead = null;
		
		// Use switch to change direction that head is added
		switch (direction) {
		case 0;
		case 1;
		case 2;
		case 3;
		}
		
		body.addHead(newHead); // Add new head at the front of the LinkedList
		body.removeHead(); // Remove last list item or tail of snake
	}
}
