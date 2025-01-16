/*

Core game logic: manages snake, food, collision detection, 
game loop, game state (Game Over)

*/

package main;

import java.awt.*;
import java.awt.event.*; // Captures key presses
import javax.swing.*;


public class Game implements ActionListener {
	
	private Snake snake; // Snake Object
	private Food food; // Food Object
	private boolean active; // Game: Active (true) Terminated (false)
	private Timer timer; // Timer starts game loop
	private int score; // Player score
	private int highScore;
	private Color snakeCostume;
	private int costume;
	private String costumeName;
	private GamePanel panel; // Reference GamePanel
	
	public Game(GamePanel panel) {
		this.snake = new Snake();
		this.food = new Food(); // Initialize snake and food
		this.active = true;
		this.score = 0; // Set score to 0 and game to true
		this.highScore = 0;
		this.timer = new Timer(100, this); // Initialize timer for game loop at 100ms or 10 times per second = 10FPS
		this.panel = panel; // Initialize Panel
		this.costume = costume;
		this.costumeName = costumeName;
	}
	
	public void start() {
		this.timer.start(); // Start game loop
	}
	
	
	// Method triggered by timer every 100ms
	public void actionPerformed(ActionEvent e) {
		if (active) {
			updateGame();
			checkBorder();
			checkBody();
			getFood();
            panel.repaint(); // Repaint panel every 100ms
		}
	}
		
	private void updateGame() {
		snake.move(); // Move snake based on direction registered from input
		
		if (snake.getHead().equals(food.getLocation())) {
			score += 1;
			food.newLocation();
			snake.grow();
			System.out.println("Score: " + score);
		}
	}
	
	public void restart() {
		snake = new Snake();
		food = new Food();
		score = 0;
		active = true;
		timer.restart();
		panel.repaint();
	}
	
	public void changeCostume() {	
		switch(costume) {
		case 0: 
			snakeCostume = Color.DARK_GRAY;
			costume = 1;
			costumeName = "Dark Gray";
			break;
		case 1:
			snakeCostume = Color.PINK;
			costume = 2;
			costumeName = "Pink";
			break;
		case 2: 
			snakeCostume = Color.GREEN;
			costume = 3;
			costumeName = "Green";
			break;
		case 3: 
			snakeCostume = Color.BLUE;
			costume = 4;
			costumeName = "Blue";
			break;
		case 4:
			snakeCostume = Color.MAGENTA;
			costume = 5;
			costumeName = "Magenta";
			break;
		case 5:
			snakeCostume = Color.ORANGE;
			costume = 6;
			costumeName = "Orange";
			break;
		case 6:
			snakeCostume = Color.CYAN;
			costume = 7;
			costumeName = "Cyan";
			break;
		case 7:
			snakeCostume = Color.WHITE;
			costume = 8;
			costumeName = "White";
			break;
		case 8:
			snakeCostume = Color.RED;
			costume = 9;
			costumeName = "Red";
			break;
		case 9:
			snakeCostume = Color.YELLOW;
			costume = 0;
			costumeName = "Yellow";
			break;
		}	
	}
		
	
	private void checkBorder() {
		if (snake.getHead().x < 0 || snake.getHead().x >= 300 || snake.getHead().y < 0 || snake.getHead().y >= 300) {
			updateHighScore();
			active = false;
			System.out.println("Game Over.");
		}
	}
	
	private void checkBody() {
		for (int i = 1; i < snake.getBody().size(); i++) {
            if (snake.getHead().equals(snake.getBody().get(i))) {
            	updateHighScore();
                active = false;
            }
        }
    }
	
	private void updateHighScore() {
		if (score > highScore) {
			highScore = score;
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
	
	public int getHighScore() {
		return highScore;
	}
	
	public Color getSnakeCostume() {
	    return snakeCostume;
	}
	
	public String getCostumeName() {
		return costumeName;
	}
	
	
}
