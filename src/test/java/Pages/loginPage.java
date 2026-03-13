package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumberHooks.DriverManager;

public class loginPage {
	
	  WebDriver driver;
	  public loginPage(WebDriver driver) {
	        this.driver = driver;
	    }
	  
	private By srchBox = By.name("q"); 
	
	
	public  void searchText(String srchTxt) {
		
		DriverManager.getDriver().findElement(srchBox).sendKeys(srchTxt);
	}
	
	
public void srchEnter() {
		
		 
		DriverManager.getDriver().findElement(srchBox).sendKeys(Keys.ENTER);
	}

	
}
