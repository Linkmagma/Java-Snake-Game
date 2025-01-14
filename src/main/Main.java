/*

Set up JFrame, receive user input, start game loop

*/

package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
	
    public static void main(String[] args) {
    	
    	GamePanel panel = new GamePanel(); // Game panel for graphics inside JFrame
    	Game game = new Game(panel); // Game object passed to game constructor
    	panel.setGame(game); // Set game for panel
    	
    	// Set Up JFrame
    	
    	JFrame frame = new JFrame("Snake"); // Window title
    	frame.setSize(500, 500);; // Window size
    	frame.add(panel); // Add panel to frame
    	
    	
    	// KeyListener for key presses
    	
    	frame.addKeyListener(new KeyAdapter() {
    		@Override
    		public void keyPressed(KeyEvent e) {
    			// Detect key pressed
    			int keyCode = e.getKeyCode();
    			if (keyCode == KeyEvent.VK_UP) {
    				game.getSnake().setDirection(0);
    				System.out.println("UP");
    			} else if (keyCode == KeyEvent.VK_RIGHT) {
    				game.getSnake().setDirection(1);
    				System.out.println("RIGHT");
    			} else if (keyCode == KeyEvent.VK_DOWN) {
    				game.getSnake().setDirection(2);
    				System.out.println("DOWN");
    			} else if (keyCode == KeyEvent.VK_LEFT) {
    				game.getSnake().setDirection(3);
    				System.out.println("LEFT");
    			} else if (keyCode == KeyEvent.VK_0) {
    				game.restart();
    				System.out.println("RESTART");
    			}
    		}
    	});
    	
    	game.start();
    	frame.setVisible(true); // Window = visible
    	
    }
}
