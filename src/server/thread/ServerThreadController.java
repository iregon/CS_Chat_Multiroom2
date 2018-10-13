package server.thread;

import java.net.Socket;

import server.ServerModel;

public class ServerThreadController {
	private ServerThreadModel serverThreadModel;
	private ServerThreadView serverThreadView;
	
	// Identificatore univoco dell'utente
	private int idCounter;
	
	private Socket socket;
	private ServerModel serverModel;
	
	public ServerThreadController(ServerThreadModel serverThreadModel, ServerThreadView serverThreadView, int idCounter, Socket socket, ServerModel serverModel) {
		this.serverThreadModel = serverThreadModel;
		this.serverThreadView = serverThreadView;
		this.idCounter = idCounter;
		this.socket = socket;
		this.serverModel = serverModel;
	}
	
	

}
