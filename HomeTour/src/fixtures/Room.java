package fixtures;

import java.util.HashMap;
import java.util.Map;

public class Room extends Fixtures{
	//Exits and Items Map
	Map<String,Room> exitsAndItems = new HashMap<>();
	//default constructor
	public Room() {
		super("name", "shortDescription", "longDescription");
	}
	
	//constructor
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	//Overwrites toString()
	public String toString() {
		return  getName() + 
				"\n\n" + getLongDescription();
	}
	
	public String toStringShort() {
		return getName() +
				"\n\n" + getShortDescription();
	}
	
	public void printExits() {
		System.out.println();
		System.out.println("Exits and Visible Items:\n");
		for(String key: exitsAndItems.keySet()) {
				switch(key) {
				
				case "North":
					System.out.println("North: " + exitsAndItems.get(key).getShortDescription());
					break;
				case "East":
					System.out.println("East: " + exitsAndItems.get(key).getShortDescription());
					break;
				case "South":
					System.out.println("South: " + exitsAndItems.get(key).getShortDescription());
					break;
				case "West":
					System.out.println("West: " + exitsAndItems.get(key).getShortDescription());
					break;
				case "Item":
					System.out.println("Item: " + exitsAndItems.get(key).getShortDescription());
					break;
				default:
						System.out.println("Outside of bounds");
						break;	
				}
				
			}
		}
	// getters and setters
	public Room getExitDirection(String direction) {
		return exitsAndItems.get(direction);
	}
	
	public Room getItem(String item) {
		return exitsAndItems.get(item);
	}
	
	public void setExitDirection(String key, Room exit) {
		exitsAndItems.put(key, exit);
	}
	
	public void setItem(String key, Room item) {
		exitsAndItems.put(key, item);
	}
	//Remove items from exitsAndItems
	public void removeItem(String key) {
		exitsAndItems.remove(key);
	}
	
}
