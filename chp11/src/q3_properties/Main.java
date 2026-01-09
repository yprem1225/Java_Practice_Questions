package q3_properties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File("info.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileReader fileReader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(fileReader);
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
	}

}
