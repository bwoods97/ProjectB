package game;
import fixtures.*;
public class RoomManager {
	Room startingRoom;
	Room[] allRooms;
	
	public void init() {
		Room entryHall = new Room ("Entry Hall", 
				"Entry hall to the house.", 
				"The Entry hall to the house. "
				+ "\nTo the West is a Dining Room with a table and Chandelier."
				+ "\nTo the North is the living room where you hear the TV.");
		Room diningHall = new Room("Dining Room",
				"Dining Room with a table and Chandelier",
				"A Good sized Dining Room with a table, chairs, a few cabinates full of plates and glasses, and a chandelier hanging over the table. "
						+ "\nTo the North is the Kitchen which you can spot the Fridgerator from the dining room."
						+ "\nTo the East is the entry hall, which goes to the living room or the stairs");
		Room livingRoom = new Room("Living Room",
				"Living Room with a couch and TV", 
				"A Living room with a comfy couch, a few chairs, and a TV currently showing Premier League Futbol. "
						+ "\nTo the West is the Kitchen which you can spot the Oven and Stove from the Living room."
						+ "\nTo the south is the entry hall, which goes to the Dining room or the stairs."
						+ "\nTo the east is the door to the bathroom.");
		Room kitchen = new Room("kitchen",
				"Kitchen with a stove, oven, and sink.", 
				"A Kitchen with Stainless steel sink, A stove and Oven, and a fully stocked refridgerator"
						+ "\nTo the East is the Living Room which you can See a Futbol game on the TV."
						+ "\nTo the South is the Dining Room, which is illuminated by the Chandelier");
		Room bathroom = new Room("Bathroom",
				"A common household Bathroom", 
				"The bathroom connects to the main house from a doorway in the Living Room."
						+ "\nThere is a toilet and a sink with a mirror hanging on the wall."
						+ "\nOn the sink, there is some soap, and hanging on a fixture next to the door is a handtowel."
						+ "\nThe door leads West back towards the living room, where a futbol game is being displayed.");
		
		
		
		allRooms = new Room[5];
		allRooms[0] = entryHall;
		allRooms[1] = diningHall;
		allRooms[2] = livingRoom;
		allRooms[3] = kitchen;
		allRooms[4] = bathroom;
		
		entryHall.setNorthExit(livingRoom);
		entryHall.setWestExit(diningHall);
		
		diningHall.setNorthExit(kitchen);
		diningHall.setEastExit(entryHall);
		
		livingRoom.setEastExit(bathroom);
		livingRoom.setSouthExit(entryHall);
		livingRoom.setWestExit(kitchen);
		
		kitchen.setEastExit(livingRoom);
		kitchen.setSouthExit(diningHall);
		
		bathroom.setWestExit(livingRoom);
		
		startingRoom = entryHall;
	}

	public Room getStartingRoom() {
		return startingRoom;
	}

	
}
