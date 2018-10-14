package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.bind.DatatypeConverter;

public class MD5MessageDigester {
	
	private volatile static MD5MessageDigester instance = null;
	
	private MD5MessageDigester() {}
 
    public static MD5MessageDigester getMD5MessageDigester() {
        if (instance == null) {
            synchronized (MD5MessageDigester.class){
                if (instance == null) instance = new MD5MessageDigester();
            }
        }
        return instance;
    }
	
	public String stringToMD5(String msg) {
		MessageDigest md;
		String hash = "";
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(msg.getBytes());
			byte[] digest = md.digest();
			hash = DatatypeConverter.printHexBinary(digest).toUpperCase();
		} catch (NoSuchAlgorithmException e) {
			//TODO: eccezione nella generazione della stringa in md5
		}
		return hash;
	}
}
