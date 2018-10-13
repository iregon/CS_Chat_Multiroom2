package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import config.Configuration;
import server.thread.MVCServerThread;
import utils.DateManager;
import utils.LogManager;

public class ServerController {
	
	private ServerModel serverModel;
	private ServerView serverView;
	
	private int idCounter = 1;
	
	private ServerSocket serverSocket;
	
	public ServerController(ServerModel serverModel, ServerView serverView) {
		this.serverModel = serverModel;
		this.serverView = serverView;
		
		String date = DateManager.getDateManager().getTodaysDataTime();
		LogManager.getLogManager().appendLog(">>> Server avviato il " + date + "\n");
		
		startServerSocket();
		
		connectionsHandler();
	}
	
	private void startServerSocket() {
		int port = Configuration.getConfiguration().getPort();
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			LogManager.getLogManager().appendErrorLogWithNewLine(e.getMessage());
		}
	}
	
	private void connectionsHandler() {
		try {			
			while (true) {
				Socket socket = serverSocket.accept();
				new MVCServerThread(idCounter, socket, serverModel);
				idCounter++;
			}
		} catch (IOException e) {
			LogManager.getLogManager().appendErrorLogWithNewLine(e.getMessage());
		}
	}
}
