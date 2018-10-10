package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
    }
    
    public synchronized void appendLogWithNewLine(String msg) {
    	String fileName = generateFileName();
    	diskManager.writeOnDisk(path, fileName, msg + "\n");
    }
    
    public synchronized void appendErrorLogWithNewLine(String msg) {
    	String fileName = generateFileName();
    	diskManager.writeOnDisk(path, fileName, ">>> ERROR\n> " + msg + "\n");
    }
    
    private String generateFileName() {
    	String date = DateManager.getDateManager().getTodaysData();
		
		String file = "log_" + date + ".dat";
		
		return file;
    }
}
