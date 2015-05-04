/*
*	Game.java
*   The one and only needed file for BBG - Ben's Boring Game.
*	Why be organized when we can fit everything in one file.
*	See ReadMe.txt, Changelog.txt, and HowToPlay.txt for more info.
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Game {
	// Important fields
	static Scanner input;
	// Game info
	static final String GAME_NAME = "BBG - Ben's Boring Game";
	static final String GAME_VERSION = "1.0";
	// Player info
	static String pName;
	// Other
	static int maxLevels;


	// The main method
	public static void main(String[] args) {
		onGameStart(); // Code called for when the game starts
		playGame(); // The actaul game code, ran after onGameStart()
	}

	//////////////////////////////////////////////////////////////////////////////////////////

	// When the game starts this should be ran
	public static void onGameStart() {
		System.out.println(GAME_NAME + " " + GAME_VERSION);
		System.out.println("Loading...");
		input = new Scanner(System.in);
		System.out.println("Welcome to BBG, what's your name?");
		pName = input.nextLine();
		System.out.println("Ok, " + pName);
		System.out.println("Enter how many levels the game should have: ");
		maxLevels = input.nextInt();
		System.out.println("Player name: " + pName);
		System.out.println("Total levels: " + maxLevels);
		System.out.println("Loading game...");
	}

	// The actaul game code
	public static void playGame() {
		
		mainMenu();

		while (true) {
			System.exit(1);
		}
		



	}

	/////////////////////////////////////////////////////////////////////////////////////////

	// Utility methods

	// Quits after confirmation
	public static boolean quitGame() {
		System.out.println("Quit now? [y/n]");
		String quitNow = input.nextLine();
		if (quitNow.equals("y")) {
			System.out.println("Quiting...");
			System.out.println("[quitGame()] - disposing of variables.");
			input.close();
			System.out.println("[quitGame()] - done. exiting.");
			System.exit(1);
			return true;
		} else {
			System.out.println("Not quiting. Resuming game.");
			return false;
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////////
	// UI methods
	public static void mainMenu() {
		System.out.println(GAME_NAME + " " + GAME_VERSION);
		System.out.println("Press 'a' to learn about game, 'p' to play!");
		String action = input.next();
		if (action.equals("a")) {
			System.out.println("A tribute to my programming and logic teacher who sucks...");
			System.out.println("Who can't be bothered to learn the material she already should know.");
			System.out.println("Let's show the 'about' info in a JOptionPane, something she used to make herself feel smart.");
			JOptionPane.showMessageDialog(null, "I made this game because I was bored. I still am.", "About game", JOptionPane.INFORMATION_MESSAGE);
			return;  z
		} else {
			System.out.println("Ready to play the game are we? Just know that I like dank memes.");
			return;
		}
	}


}
