/*
 
Renders Game on the screen

*/


package main;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GamePanel extends JPanel {
	
	private Game game; // Game Logic
	
	public GamePanel() {
		this.game = new Game(); // Initialize Game
		setPreferredSize(new Dimension(500, 500)); // Size of GamePanel
		setBackground(Color.BLACK);
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		
		if (game.isActive()) {
			gameActive(g); // Draw game elements
		} else {
			gameOver(g); // Draw "Game Over"
		}
		
		
	}
	
	public void gameActive(Graphics g) {
		
	}
	
	public void gameOver(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawString("Game Over", 200, 150); // Game Over message
	}
}
