package server;

public class MVCServer {
	
	public static void main(String[] args) {
		ServerModel serverModel = new ServerModel();
		ServerView serverView = new ServerView();
		
		@SuppressWarnings("unused")
		ServerController serverController = new ServerController(serverModel, serverView);
		
		serverView.setVisible(true);
	}
	
}
