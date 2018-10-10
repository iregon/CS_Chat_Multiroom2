package connection;

public interface Connection {
	void setRemoteIP(String remoteIP);
	String getRemoteIP();
	
	void sendData(Object obj);
	Object reciveData();
}
