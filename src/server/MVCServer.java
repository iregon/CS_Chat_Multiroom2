package server;

import utils.ServerViewLogManager;

public class MVCServer {
	
	public static void main(String[] args) {
		ServerModel serverModel = new ServerModel();
		ServerView serverView = new ServerView();
		
		ServerViewLogManager.getDateManager().setServerView(serverView);
		
		@SuppressWarnings("unused")
		ServerController serverController = new ServerController(serverModel, serverView);
		
		serverView.setVisible(true);
	}
	
}
