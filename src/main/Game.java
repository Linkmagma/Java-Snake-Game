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
		this.timer = new Timer(100, this); // Initialize timer for game loop at 100ms or 10 times per second = 10FPS
	}
	
	public void start() {
		this.timer.start(); // Start game loop
	}
	
	
	// Method triggered by timer every 100ms
	public void actionOccurred(ActionEvent e) {
		if (active) {
			updateGame(); // Move snake and check if food eaten
			checkCollisions();  // Check for collision
		}
		
	private void updateGame() {
		snake.move(); // Move snake based on direction registered from input
		
		if (snake.head().equals(food.getLocation())) {
			score += 1;
			food.randomFood();
			snake.grow();
		}
	}
	
	private void checkCollisions() {
		if (snake.collidesWithBorder()) {
			active = false; // Game over
			System.out.println("Game Over. Score: " + score);
		}
	}
	
	// Getter methods for game components
	
	public boolean isActive() {
		return active;
	}
	
	public int getScore() {
		return score;
	}
	
	public Snake getSnake() {
		return snake;
	}
	
	public Food getFood() {
		return food;
	}
	
}
