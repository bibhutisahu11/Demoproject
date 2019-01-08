package CommonLib;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.testng.TestNG;

import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BaseTest {

   
	public WebDriver driver;
	String strUsername, strPassword;
	public  static EventFiringWebDriver ef_driver;
	public static WebEventListener eventListener;

	

		public static void main(String [] arg){
				
				
			    ReadingPropertyFile rp = new ReadingPropertyFile();
			    try {
			    	
					rp.readProperty();
					
				} catch (IOException e) {
					
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 // Create object of TestNG Class
			    TestNG runner=new TestNG();

				// Create a list of String 
				List<String> suitefiles=new ArrayList<String>();

				// Add xml file which you have to execute
				suitefiles.add("src/test/java/config/testng.xml");

				// now set xml file for execution
				runner.setTestSuites(suitefiles);

				// finally execute the runner using run method
				runner.run();
			}


	
		
	@Parameters({"browserType","applicationURL"})
	@BeforeClass

	public void setup(String strBrowserType, String strApplicationURL) throws Exception{
		 
		ReadingPropertyFile rp = new ReadingPropertyFile();
		    try {
		    	
				rp.readProperty();
				
			} catch (IOException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//Check if parameter passed from TestNG is 'firefox'
		
//		if(strBrowserType.equalsIgnoreCase("firefox")){
//
//			//create firefox instance
//			//System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//           // System.setProperty("webdriver.gecko.driver","src\\executables\\geckodriver.exc");
//			FirefoxDriverManager.getInstance().setup();
//			FirefoxProfile profile=new FirefoxProfile();
//			profile.setAcceptUntrustedCertificates(true);
//            driver = new FirefoxDriver(profile);
//			driver.manage().window().maximize();
//			driver.get(strApplicationURL);
//			System.out.println(driver.getTitle());
//			
//		}

		//Check if parameter passed as 'chrome'

		 if(strBrowserType.equalsIgnoreCase("chrome")){

			//set path to chromedriver.exe You may need to download it from http://code.google.com/p/selenium/wiki/ChromeDriver
          // this is the chrome driver path for linux 
		    //System.setProperty("webdriver.chrome.driver","//usr//bin//chrome");
			//System.out.println("inside chrome base test");
			//Create Chrome instance
			/*try{
				System.out.println("chromedriver");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(strApplicationURL);
			}
			catch(Exception e) {
				System.out.println(e);
			}*/

			System.setProperty("webdriver.chrome.driver","src\\test\\java\\Executables\\chromedriver_win\\chromedriver.exe");
			//ChromeDriverManager.getInstance().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(strApplicationURL);
			System.out.println(driver.getTitle());
						
		}

		else if(strBrowserType.equalsIgnoreCase("internet explorer")){

			System.setProperty("webdriver.ie.driver","src\\executables\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(strApplicationURL);
			
			//now we are going to use javascipt ,This will click on "Continue to this website (not recommended)" text and will //push us to the page
			driver.navigate().to("javascript:document.getElementById('overridelink').click()");
			
			
		}

		/*else if(strBrowserType.equalsIgnoreCase("phantomjs")){
			
			File file = new File("src\\executables\\phantomjs-1.9.8-windows\\phantomjs-1.9.8-windows\\phantomjs.exe");				
			System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
		
			String[] cli_args = new String[]{ "--ignore-ssl-errors=true" };
			DesiredCapabilities caps = DesiredCapabilities.phantomjs();
			caps.setCapability( PhantomJSDriverService.PHANTOMJS_CLI_ARGS, cli_args );
			caps.setCapability( PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/tmp/config/bin/phantomjs");
			driver =  new PhantomJSDriver( caps );

			driver.manage().window().maximize();
			driver.get(strApplicationURL);
			driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		
		}*/
		
		else{

			//If no browser passed throw exception

			throw new Exception("Browser is not correct");

		}
		 ef_driver = new EventFiringWebDriver(driver);
			eventListener = new WebEventListener();
			ef_driver.register(eventListener);
			driver = ef_driver;


	}
	
}



