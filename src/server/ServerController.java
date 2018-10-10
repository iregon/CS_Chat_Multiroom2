package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import server.thread.MVCServerThread;
import utils.DateManager;
import utils.LogManager;

public class ServerController {
	private ServerModel serverModel;
	private ServerView serverView;
	
	private int idCounter = 1;
	
	public ServerController(ServerModel serverModel, ServerView serverView) {
		this.serverModel = serverModel;
		this.serverView = serverView;
		
		connectionHandler();
	}
	
	private void connectionHandler() {
		try {
			ServerSocket ss = new ServerSocket(9090);
			
			String date = DateManager.getDateManager().getTodaysData();
			LogManager.getLogManager().appendLog(">>> Server avviato il " + date);
			
			while (true) {
				Socket socket = ss.accept();
				new MVCServerThread(idCounter, socket, serverModel);
				idCounter++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
