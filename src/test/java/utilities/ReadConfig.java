package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public static Properties properties;
	public static String path = "config.properties"; // Use "src/test/resources/config.properties" if inside resources folder

	static {
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		} catch (IOException e) {
			throw new RuntimeException("Could not find config.properties at: " + path, e);
		}
	}

	public static String getBrowser() {
		String value = properties.getProperty("browser");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("Browser is not found on specified path");
		}
	}

	public static String getUrl() {
		String url = properties.getProperty("url");
		if (url != null) {
			return url;
		} else {
			throw new RuntimeException("URL is not found on specified path");
			}
		}

	
		public static String getUsername() {
			String Username = properties.getProperty("Username");
			if (Username!= null) {
				return Username;
			} else {
				throw new RuntimeException("Username is not found on specified path");
			}
		}
			public static String getPassword() {
				String Password= properties.getProperty("Password");
				if (Password!= null) {
					return Password;
				} else {
					throw new RuntimeException("password is not found on specified path");
				}
			
	}
}