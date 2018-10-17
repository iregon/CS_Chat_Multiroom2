package server;

import java.util.ArrayList;

public class ServerModel {
	
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Room> rooms = new ArrayList<Room>();
	
	public ServerModel() {}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	
	public void addUser(User user) {
		this.users.add(user);
	}
	
	public void removeUser(User user) {
		users.remove(user);
	}
}
