/*

Food item that is randomly positioned on game grid

*/
import  java.util.Random;
import java.awt.*;

package main;

public class Food {
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
