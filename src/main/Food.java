/*

Food item that is randomly positioned on game grid

*/
<<<<<<< HEAD
package main;

import  java.util.Random;
import java.awt.*;

=======

package main;

import  java.util.Random;
import java.awt.*;

>>>>>>> 79a8cf113a17c6703f788c4f4ed4300aefdd85fb
public class Food {
	private Food food;
	private Random gen = new Random();
	private int x;
	private int y;
	private Point location;
	public Food() {
		
	}
	public void newLocation() {
		x = gen.nextInt(0,49) * 10;
		y = gen.nextInt(0,49) * 10;
		location = new Point(x,y);
	}
	public Point getLocation() {
		return location;
	}
	
}
