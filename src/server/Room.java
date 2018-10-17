package server;

import java.util.ArrayList;

public class Room {
	private String name;
	
	private ArrayList<User> usersInThisRoom = new ArrayList<User>();

	public Room(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addUser(User user) {
		usersInThisRoom.add(user);
	}
	
	public void removeUser(User user) {
		for(int i = 0; i < usersInThisRoom.size(); i++) {
			if(usersInThisRoom.get(i).getId() == user.getId()) {
				usersInThisRoom.remove(i);
				break;
			}
		}
	}
}
