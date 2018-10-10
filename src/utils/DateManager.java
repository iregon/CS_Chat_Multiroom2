package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateManager {
	
	private volatile static DateManager instance = null;
	
	private DateManager dateManager;
	
	private DateManager() {
		dateManager = new DateManager();
    }
 
    public static DateManager getDateManager() {
        if (instance == null) {
            synchronized (DateManager.class){
                if (instance == null) instance = new DateManager();
            }
        }
        return instance;
    }
	
	public String getTodaysData() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd");
		Calendar cal = Calendar.getInstance();
		
		return dateFormat.format(cal.getTime());
	}
}
