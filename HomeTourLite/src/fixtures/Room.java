package fixtures;

public class Room {
	public String name;
	
	public Room[] exits = new Room[2];
	
	public Room(String name) {
		this.name = name;
	}

	public String toString() {
		return "Room [name= " + name + "]";
	}
	
	public Room getLeftExit() {
		return exits[0];
	}
	
	public Room getRightExit() {
		return exits[1];
	}
	
	public void setRightExit(Room exit) {
		exits[1] = exit;
	}
	public void setLeftExit(Room exit) {
		exits[0] = exit;
	}
	
}
