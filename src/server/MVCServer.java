package server;

public class MVCServer {
	
	public static void main(String[] args) {
		ServerModel serverModel = new ServerModel();
		ServerView serverView = new ServerView();
		
		ServerController serverController = new ServerController(serverModel, serverView);
		
		serverView.setVisible(true);
	}
	
}
