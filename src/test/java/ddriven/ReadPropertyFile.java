package ddriven;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\Testdata\\config.properties");
		Properties proptiesobj = new Properties();
		proptiesobj.load(file);
		String user = proptiesobj.getProperty("UserId");
		System.out.println(user);
	}

}
