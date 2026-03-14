package cucumberHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {

 	
	@Before
	public void setup() throws Exception {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
	        DriverManager.setDriver(driver);
//		 DriverManager.driver=new ChromeDriver();
//		 DriverManager.driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		//Thread.sleep(1000);
		
	      
	}
	
	@After
	public void teardown()
	{
		//DriverManager.driver.quit();
		   DriverManager.getDriver().quit();
		   System.out.println("Driver Closed successfully");
	        DriverManager.unload();
	}
}
