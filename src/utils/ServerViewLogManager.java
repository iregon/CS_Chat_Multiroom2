package utils;

import server.ServerView;

public class ServerViewLogManager {

	private volatile static ServerViewLogManager instance = null;
	
	private ServerView serverView;
	
	private ServerViewLogManager() {}
 
    public static ServerViewLogManager getServerViewLogManager() {
        if (instance == null) {
            synchronized (ServerViewLogManager.class){
                if (instance == null) instance = new ServerViewLogManager();
            }
        }
        return instance;
    }
    
    public synchronized ServerView getServerView() {
		return serverView;
	}

	public synchronized void setServerView(ServerView serverView) {
		this.serverView = serverView;
	}
	
	public synchronized void appendLog(String msg) {
    	serverView.appendLog(msg);
    }
    
    public synchronized void appendLogWithNewLine(String msg) {
    	serverView.appendLog(msg + "\n");
    }
    
    public synchronized void appendErrorLogWithNewLine(String msg) {
    	serverView.appendLog(">>> ERROR\n> " + msg + "\n");
    }
}
