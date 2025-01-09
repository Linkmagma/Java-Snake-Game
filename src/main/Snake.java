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

	public Snake() {
		body = new LinkedList<>();
		body.add(new Point(50, 50)); // Snake head start position
		body.add(new Point(40, 50)); // First segment after head
		body.add(new Point(30, 50)); // Second segment after head
		
		direction = 1; // 0 = up, 1 = right, 2 = down, 3 = left)
	}
	
	// Move snake in direction by adding head segment and removing last body segment
	public void move() {
		Point head = body.getFirst(); // Get current snake head
		Point newHead = null;
		
		// Use switch to change direction that head is added
		switch (direction) {
			case 0:
				newHead = new Point(head.x, head.y - SIZE); // Decrease y to move upwards
				break;
			case 1:
				newHead = new Point(head.x + SIZE, head.y); // Increase x to move right
				break;
			case 2:
				newHead = new Point(head.x, head.y + SIZE); // Increase y to move down
				break;
			case 3:
				newHead = new Point(head.x - SIZE, head.y); // Decrease x to move left
				break;
		}
		
		body.addFirst(newHead); // Add new head at the front of the LinkedList
		body.removeLast(); // Remove last list item or tail of snake
	}
	
	public void grow() {
		Point tail = body.getLast(); // Get the last segment of the snake (the tail)
		body.addLast(tail); // Add segment at the end of the snake to keep it longer
	}
	
	// Getter methods for accessing snake's body and direction
	
	public LinkedList<Point> getBody() {
		return body;
	}
	
	public int getDirection() {
		return direction;
	}
	
	public Point getHead() {
		return body.getFirst(); // Return the head of the snake
	}
	
	public void setDirection(int newDirection) {
		direction = newDirection;
	}
	
}
