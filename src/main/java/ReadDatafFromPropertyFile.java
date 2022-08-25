import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDatafFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Step1 : use FileInputStream to load the property file
		
		FileInputStream fis = new FileInputStream(".\\Data\\commanData.properties");
		
		//step2 : create object of properties and load the files 
		
		Properties prop = new Properties();
		prop.load(fis);
		
		//step3 : provide the key to read the value 
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String username = prop.getProperty("username");
		System.out.println(username);
		
		String password = prop.getProperty("password");
		System.out.println(password);
		
		String br = prop.getProperty("browser");
		System.out.println(br);

	}

}
