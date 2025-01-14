/*
 
Renders Game on the screen

*/


package main;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GamePanel extends JPanel {
	
<<<<<<< HEAD
	private Game game;
	public final Dimension SCALE = new Dimension(10, 10);
=======
	private Game game; // Game Logic
>>>>>>> dec0f6c60ac33488f2a98d3123f980bb71c0bd94
	
	public GamePanel() {
		this.game = new Game(); // Initialize Game
		setPreferredSize(new Dimension(500, 500)); // Size of GamePanel
		setBackground(Color.BLACK);
	}
<<<<<<< HEAD

	public void gameActive() {
=======
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (game.isActive()) {
			gameActive(g); // Draw game elements
		} else {
			gameOver(g); // Draw "Game Over"
		}
		
>>>>>>> dec0f6c60ac33488f2a98d3123f980bb71c0bd94
		
	}
			
	public void gameActive(Graphics g) {
		
	}
	
	public void gameOver(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawString("Game Over", 200, 150); // Game Over message
	}
}
