package utils;

public class LogManager {
	
    private volatile static LogManager instance = null;
    
	private String path = "logs/";
	
	private DiskManager diskManager;
	
    private LogManager() {
    	diskManager = new DiskManager();
    }
 
    public static LogManager getLogManager() {
        if (instance == null) {
            synchronized (LogManager.class){
                if (instance == null) instance = new LogManager();
            }
        }
        return instance;
    }
    
    public synchronized void appendLog(String msg) {
    	String fileName = generateFileName();
    	diskManager.writeOnDisk(path, fileName, msg);
    	ServerViewLogManager.getServerViewLogManager().appendLog(msg);
    }
    
    public synchronized void appendLogWithNewLine(String msg) {
    	String fileName = generateFileName();
    	String msg1 = msg + "\n";
    	diskManager.writeOnDisk(path, fileName, msg1);
    	ServerViewLogManager.getServerViewLogManager().appendLog(msg1);
    }
    
    public synchronized void appendErrorLogWithNewLine(String msg) {
    	String fileName = generateFileName();
    	String msg1 = ">>> ERROR\n> " + msg + "\n";
    	diskManager.writeOnDisk(path, fileName, msg1);
    	ServerViewLogManager.getServerViewLogManager().appendLog(msg1);
    }
    
    private String generateFileName() {
    	String date = DateManager.getDateManager().getTodaysData();
		
		String file = "log_" + date + ".dat";
		
		return file;
    }
}
