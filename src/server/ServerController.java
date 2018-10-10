package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			logManager.appendLog(">>> Server avviato il " + dateFormat.format(cal.getTime()));
			
			while (true) {
				Socket s = ss.accept();
				new ServerThread(idCounter, s, logManager, users, rooms);
				idCounter++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
