package CommonLib;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ReadingPropertyFile {
	
	public static Properties prop;
	
	public void readProperty() throws IOException {
		  // TODO Auto-generated method stub
		  //For reading property file we have to create object
		  //Create an object of property class
		  //import property files.
		try{
			prop = new Properties();
			//Now make an object of file input stream
			  //import the files after creating object
			
			  FileInputStream ip = new FileInputStream("src/test/java/Config/OR.properties");
			  prop.load(ip);
			  System.out.println("load all propeties");
		}
		
		catch (FileNotFoundException e){
			e.printStackTrace();
			
			
		}
		   
		  

	}

}
	 