/*

Core game logic: manages snake, food, collision detection, 
game loop, game state (Game Over)

*/

package main;

import java.awt.*;
import java.awt.event.*; // Captures key presses (Arrow Keys)
import javax.swing.*;


public class Game implements ActionListener {
	
	private Snake snake; // Snake Object
	private Food food; // Food Object
	private boolean active; // Game: Active (true) Terminated (false)
	private Timer timer; // Timer starts game loop
	private int score; // Player score
	
	public Game() {
		this.snake = new Snake();
		this.food = new Food(); // Initialize snake and food
		this.active = true;
		this.score = 0; // Set score to 0 and game to true
		this.timer = new Timer(100, this); // Initialize timer for game loop at 100ms = 1/10 second 10 FPS
	}
	
	public void start() {
		this.timer.start(); // Start game loop
	}
}
