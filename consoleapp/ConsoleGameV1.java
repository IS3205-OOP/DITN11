package consoleapp;

import java.util.Scanner;

import week03.slot02.Map;
import week03.slot02.Pirate;

public class ConsoleGameV1 {
	static Map map = new Map(6, 6);
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Pirate Game");
		
		map.addPirate(2, 2, new Pirate());
		map.addPirate(4, 2, new Pirate("Blackbeard", 5));
		map.addPirate(0, 0, new Pirate("Redbeard", 7));
		map.addPirate(1, 5, new Pirate());
		
		
		while(true) {
			System.out.println("Select Action:");
			System.out.println("(1) Print arena");
			System.out.println("(2) Add object to arena");
			System.out.println("(3) Move Pirate up");
			System.out.println("(4) Move Pirate down");
			System.out.println("(5) Move Pirate left");
			System.out.println("(6) Move Pirate right");
			System.out.println("(7) Restart Game");
			System.out.println("(8) Quit Game");
			
			String input = scanner.nextLine();
			
			switch(input) {
			case "1":
				// Print arena
				printArena(map);
				break;
			case "2":
				// Add object to arena
				break;
			case "3":
				// Move Pirate up
				movePirate("u");
				break;
			case "4":
				// Move Pirate down
				movePirate("d");
				break;
			case "5":
				// Move Pirate left
				movePirate("l");
				break;
			case "6":
				// Move Pirate right
				movePirate("r");
				break;
			case "7":
				// Restart game
				break;
			case "8":
				// Quit game
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}
	
	public static void printArena(Map map) {
		for(int y = 0; y < map.arena[0].length; y++) {
			for(int x = 0; x < map.arena.length; x++) {
				System.out.print(map.arena[x][y] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void movePirate(String direction) {
		int x = -1;
		int y = -1;
		System.out.println("Pirate x coordinate");
		String inputX = scanner.nextLine();
		x = Integer.parseInt(inputX);
		System.out.println("Pirate y coordinate");
		String inputY = scanner.nextLine();
		y = Integer.parseInt(inputY);
		
		switch(direction.toLowerCase()) {
		case "u":
			map.movePirateUp(x, y);
			break;
		case "d":
			map.movePirateDown(x, y);
			break;
		case "l":
			map.movePirateLeft(x, y);
			break;
		case "r":
			map.movePirateRight(x, y);
			break;
		}
		printArena(map);
	}
	
}
