package game;

import java.util.ArrayList;
import java.util.List;

import fixtures.*;

public class Player {

	// RoomManager rm = new RoomManager();
	Room currentRoom;

	List<Room> inventory = new ArrayList<Room>();

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

	public void addToInventory(Room Item) {
		inventory.add(Item);
	}

	public void displayInventory() {
		//for loop iterates through the inventory arraylist
		for (int i = 0; i < inventory.size(); i++) {
			System.out.println(i+1 + ". " + inventory.get(i).getName() + "\n" 
					+ inventory.get(i).getLongDescription()
					+ "\n");
			
		}
		
	}
}

