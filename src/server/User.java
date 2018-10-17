package server;

/**
 * 
 * @author Alessandro
 *
 */
public class User {
	
	private String id;
	private String nickname = null;
	
	public User(String id) {
		this.id = id;
	}
	
	public User(String id, String nickname) {
		this.id = id;
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	
}
