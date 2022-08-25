package com.onlineAdmissionSystem.comcast.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {

/**
 *   its used return the value from the property file based on key
 * @param key
 * @return value
 * @throws Throwable
 */
	public String getPropertyKeyValue(String key) throws Throwable {
		
		 FileInputStream fis=new FileInputStream(".\\Data\\commanData.properties");
		 Properties p=new Properties();
		 p.load(fis);
		
		
		String value = p.getProperty(key);
		return value;
		
	}
}



