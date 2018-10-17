
package server;

import utils.ServerViewLogManager;

/**
 * 
 * @author Alessandro
 *
 */
public class MVCServer {
	
	public MVCServer() {
		ServerModel serverModel = new ServerModel();
		ServerView serverView = new ServerView();
		
		ServerViewLogManager.getServerViewLogManager().setServerView(serverView);
		
		@SuppressWarnings("unused")
		ServerController serverController = new ServerController(serverModel, serverView);
		
		serverView.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MVCServer();
	}	
}