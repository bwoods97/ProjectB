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

		while (quit != true) {
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
		if (command.length == 2) {
			switch (command[0]) {

			case "go":
				switch (command[1]) {

				case "north":
					player.setCurrentRoom(player.getCurrentRoom().getExitDirection("North"));
					printRoom(player);
					break;
				case "south":
					player.setCurrentRoom(player.getCurrentRoom().getExitDirection("South"));
					printRoom(player);
					break;

				case "east":
					player.setCurrentRoom(player.getCurrentRoom().getExitDirection("East"));
					printRoom(player);
					break;

				case "west":
					player.setCurrentRoom(player.getCurrentRoom().getExitDirection("West"));
					printRoom(player);
					break;
				default:
					System.out.println("No such direction exists.");
					System.out.println("\n");
					printRoom(player);
					break;
				}

				break;
			case "pickup":
				switch (command[1]) {

				case "item":
					System.out.println("You picked up " + player.getCurrentRoom().getItem("Item").toStringShort());
					player.addToInventory(player.getCurrentRoom().getItem("Item"));
					player.getCurrentRoom().removeItem("Item");
					System.out.println();
					break;
				default:
					System.out.println("No such command exists.");
					System.out.println("\n");
					break;
				}
			

				printRoom(player);
				break;

			}
		} else {
			switch (command[0]) {
			case "inventory":
				player.displayInventory();
				System.out.println("\n");
				printRoom(player);
				break;

			case "quit":
				quit = true;
				break;
			default:
				System.out.println("No such command exists.");
				System.out.println("\n");
				printRoom(player);
				break;
			}

		}

	}

}
