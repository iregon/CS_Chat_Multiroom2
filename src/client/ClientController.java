package client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import config.Configuration;

public class ClientController {
	
	private ClientModel clientModel;
	private ClientView clientView;
	
	public ClientController(ClientModel clientModel, ClientView clientView) {
		this.clientModel = clientModel;
		this.clientView = clientView;
		
//		try {
//			int port = Configuration.getConfiguration().getPort();
//			Socket s = new Socket("127.0.0.1", port);
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
