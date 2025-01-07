package main;
import javax.swing.JFrame;


public class Main {
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500; // JFrame Size
	
    public static void main(String[] args) {
    	final JFrame frame = new JFrame("Snake Game"); // JFrame Window
    	frame.setSize(WIDTH, HEIGHT);
    	frame.setVisible(true);
    	final Game game = new Game(WIDTH, HEIGHT);
    	frame.add(game);
    }
}
