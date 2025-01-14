/*
 
Renders Game on the screen

*/


package main;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GamePanel extends JPanel {
	
	private Game game;
	
	public GamePanel() {
		this.game = new Game(); // Initialize Game
		setPreferredSize(new Dimension(500, 500)); // Size of GamePanel
		setBackground(Color.BLACK);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // Ensures this is called first
		
		if (game.isActive()) {
			gameActive(g); // Draw elements if game active
		} else {
			gameOver(g); // Draw "Game Over Text"
		}
		
	}
	

	private void gameActive(Graphics g) {
		// Draw Snake
		
		for (Point segment : game.getSnake().getBody()) {
			g.setColor(Color.GREEN);
			g.fillRect(segment.x, segment.y, 10, 10); // Draw snake 10x10
		}
		
		// Draw Food
		
		Point findFood = game.getFood().getLocation();
		g.setColor(Color.RED);
		g.fillRect(findFood.x, findFood.y, 10, 10); // Draw food 10x10 Pixels at current x and y coordinates
		
		// Draw Score
		
		g.setColor(Color.WHITE);
		g.drawString("Score: " + game.getScore(), 10, 20); // Display score at (10,20)
	}
	
	private void gameOver(Graphics g) {
		// Draw Game Over
	}
	
	
}
