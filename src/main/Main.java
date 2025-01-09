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
    	JFrame frame = new JFrame("Snake Game"); // Window title
    	GamePanel panel = new GamePanel(); // Game panel for graphics inside JFrame
    	Game game = new Game(); // Game object
    	
    	frame.setSize(500, 500);; // Window size
    	frame.add(panel); // Add panel to frame
    	
    	// KeyListener for key presses
    	
    	frame.addKeyListener(new KeyAdapter() {
    		@Override
    		public void keyPressed(KeyEvent e) {
    			// Detect key pressed
    			int keyCode = e.getKeyCode();
    			if (keyCode == KeyEvent.VK_UP) {
    				// 77game.getSnake().setDirection(0);
    			} else if (keyCode == KeyEvent.VK_RIGHT {
    				
    			} else if (keyCode == KeyEvent.VK_DOWN) {
    				
    			} else if (keyCode == KeyEvent.VK_LEFT) {
    				
    			}
    		}
    	});
    	
    	game.start();
    	frame.setVisible(true); // Window = visible
    	
    }
}
