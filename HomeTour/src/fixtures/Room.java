package fixtures;

public class Room extends Fixtures{
	
	Room[] exits = new Room[4];

	public Room() {
		super("name", "shortDescription", "longDescription");
	}
	
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	//Overwrites toString()
	public String toString() {
		return  getName() + 
				"\n\n" + getLongDescription();
	}
	
	public void printExits() {
		System.out.println();
		System.out.println("Exits:\n");
		for(int i = 0; i < exits.length; i++) {
			
			if (exits[i] != null) {
				
				switch(i) {
				
				case 0:
					System.out.println("North: " + exits[i].getShortDescription());
					break;
				case 1:
					System.out.println("East: " + exits[i].getShortDescription());
					break;
				case 2:
					System.out.println("South: " + exits[i].getShortDescription());
					break;
				case 3:
					System.out.println("West: " + exits[i].getShortDescription());
					break;
					default:
						System.out.println("Outside of bounds");
						break;	
				}
				
			}
			else {
				continue;
			}
		}
	}
	
	public Room getNorthExit() {
		return exits[0];
	}
	
	public Room getEastExit() {
		return exits[1];
	}
	
	public Room getSouthExit() {
		return exits[2];
	}
	
	public Room getWestExit() {
		return exits[3];
	}
	
	public void setNorthExit(Room exit) {
		exits[0] = exit;
	}
	public void setEastExit(Room exit) {
		exits[1] = exit;
	}
	
	public void setSouthExit(Room exit) {
		exits[2] = exit;
	}
	public void setWestExit(Room exit) {
		exits[3] = exit;
	}
	
}
