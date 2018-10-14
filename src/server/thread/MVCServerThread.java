package server.thread;

import java.net.Socket;

import server.ServerModel;

public class MVCServerThread {
	
	public MVCServerThread(Socket socket, ServerModel serverModel) {
		
		ServerThreadModel serverThreadModel = new ServerThreadModel();
		ServerThreadView serverThreadView = new ServerThreadView();
		
		@SuppressWarnings("unused")
		ServerThreadController serverController = new ServerThreadController(serverThreadModel, serverThreadView, socket, serverModel);
		
		serverThreadView.setVisible(true);
	}	
}
