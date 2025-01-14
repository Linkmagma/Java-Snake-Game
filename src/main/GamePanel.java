/*
 
Renders Game on the screen

*/


package main;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GamePanel extends JPanel {
	
	private Game game;
	public final Dimension SCALE = new Dimension(10, 10);
	
	public GamePanel() {
		this.game = new Game(); // Initialize Game
		setPreferredSize(new Dimension(500, 500)); // Size of GamePanel
		setBackground(Color.BLACK);
	}

	public void gameActive() {
		
	}
}
