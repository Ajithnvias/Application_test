package CommonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesdata {
	
	public Properties pro = new Properties();


	public String properties(String path, String key) throws IOException {
		File fis = new File(path);
		 
		 FileInputStream f = new FileInputStream(fis);
		 
		 pro.load(f);
		
		return  (String) pro.get(key);
	}

}
