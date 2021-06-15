package game;
import java.util.Scanner;
public class Main {
	
	static Scanner input = new Scanner(System.in);
	static boolean quit;
	
	public static void main(String[] args) {
		RoomManager rm = new RoomManager();
		Player player = new Player();
		rm.init();
		player.setCurrentRoom(rm.getStartingRoom());
		printRoom(player);
		
		while(quit != true) {
			parse(collectInput(), player);
		}
	}
	
	
	private static void printRoom(Player player) {
		System.out.println(player.getCurrentRoom());
		
		player.getCurrentRoom().printExits();
	}	
	
	private static String[] collectInput() {
		
		String[] userInput = input.nextLine().split(" ");
		
		return userInput;

	}
	
	private static void parse(String[] command, Player player) {
		switch (command[0]) {
		
		case "go":
			
			switch (command[1]) {
			
			case "north":
				player.setCurrentRoom(player.getCurrentRoom().getNorthExit());
				printRoom(player);
				break;
			case "south":
				player.setCurrentRoom(player.getCurrentRoom().getSouthExit());
				printRoom(player);
				break;
				
			case "east":
				player.setCurrentRoom(player.getCurrentRoom().getEastExit());
				printRoom(player);
				break;
				
			case "west":
				player.setCurrentRoom(player.getCurrentRoom().getWestExit());
				printRoom(player);
				break;
			default:
				System.out.println("No such direction exists.");
				break;
			
			}
			break;
			
		case "quit":
			quit = true;
			break;
		}
	}
}
