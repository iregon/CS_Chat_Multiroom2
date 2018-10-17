package server.thread;

import java.awt.Color;
import java.net.Socket;

import server.ServerModel;
import server.User;
import utils.DateManager;
import utils.LogManager;
import utils.MD5MessageDigester;

public class ServerThreadController {
	private ServerThreadModel serverThreadModel;
	private ServerThreadView serverThreadView;
	
	private Socket socket;
	private ServerModel serverModel;
	
	public ServerThreadController(ServerThreadModel serverThreadModel, ServerThreadView serverThreadView, Socket socket, ServerModel serverModel) {
		this.serverThreadModel = serverThreadModel;
		this.serverThreadView = serverThreadView;
		this.socket = socket;
		this.serverModel = serverModel;
		
		createNewUser();
	}
	
	private void createNewUser() {
		String msgToId = Long.toString(DateManager.getDateManager().getTimestamp()) + socket.getLocalAddress();
		String id = MD5MessageDigester.getMD5MessageDigester().stringToMD5(msgToId);
		User newUser = new User(id);
		
		LogManager.getLogManager().appendLogWithNewLineAndColor(">>> NEW USER\n> ID: " + id, Color.BLUE);
	}

}
