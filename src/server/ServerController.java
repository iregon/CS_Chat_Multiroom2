package server;

public class ServerController {
	private ServerModel serverModel;
	private ServerView serverView;
	
	public ServerController(ServerModel serverModel, ServerView serverView) {
		this.serverModel = serverModel;
		this.serverView = serverView;
	}
}
