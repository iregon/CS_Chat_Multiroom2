package server;

import utils.ServerViewLogManager;

public class MVCServer {
	
	public MVCServer() {
		System.out.println("aaaa");
		ServerModel serverModel = new ServerModel();
		ServerView serverView = new ServerView();
		
		ServerViewLogManager.getDateManager().setServerView(serverView);
		
		@SuppressWarnings("unused")
		ServerController serverController = new ServerController(serverModel, serverView);
		
		serverView.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MVCServer();
	}	
}
