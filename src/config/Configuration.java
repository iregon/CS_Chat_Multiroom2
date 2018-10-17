package config;

/**
 * 
 * @author Alessandro
 *
 */
public class Configuration {
	
	private volatile static Configuration instance = null;
		
	public static Configuration getConfiguration() {
        if (instance == null) {
            synchronized (Configuration.class){
                if (instance == null) instance = new Configuration();
            }
        }
        return instance;
    }
	
	/**
	 * Configuration variables
	 */
	
	// Connection settings
	private int port = 9092;

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
