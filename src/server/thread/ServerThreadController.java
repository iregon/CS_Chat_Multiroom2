package server.thread;

import java.net.Socket;

import server.ServerModel;

public class ServerThreadController {
	private ServerThreadModel serverThreadModel;
	private ServerThreadView serverThreadView;
	
	
	public ServerThreadController(ServerThreadModel serverThreadModel, ServerThreadView serverThreadView, int idCounter, Socket socket, ServerModel serverModel) {
		this.serverThreadModel = serverThreadModel;
		this.serverThreadView = serverThreadView;
	}

}
