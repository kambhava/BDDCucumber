package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumberHooks.DriverManager;

public class AddtoCartPage {

	  WebDriver driver;

	public AddtoCartPage(WebDriver driver) {
		 this.driver = driver;
	}
	private By search = By.id("twotabsearchtextbox"); 
	private By result=By.xpath("//span[contains(text(),\"results\")]");
	private By sort=By.className("a-dropdown-prompt");
	private By productLink=By.xpath("//div[@data-component-type='s-search-result']//span/a[1]");
	private By addToCart=By.xpath("//*[@title='Add to Shopping Cart']");
	private By cartadded=By.xpath("//h1[contains(text(),'Added to cart')]");
	public String searchProduct(String prodName)
		{
		
		String srchresult;
	WebElement srchprod=	DriverManager.getDriver().findElement(search);
	srchprod.sendKeys(prodName + Keys.ENTER);
	
	//Switch to product page
	
//	WebElement sortBy = driver.findElement(sort);
//	 
//	if (sortBy.isDisplayed() && sortBy.isEnabled()) {
//		dropselect.selectByVisibleText("Price: Low to High");
//	}
	srchresult=	DriverManager.getDriver().findElement(result).getText();
	
	return srchresult;
		
	}
	
	public void addProdtoCart()
	{
		
		WebElement product=driver.findElement(productLink);
		product.click();
		String productName=product.getText();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows)
		{
		    if (!window.equals(parentWindow)) {
		        driver.switchTo().window(window);
		    }
		}
System.out.println(		driver.getTitle());
driver.findElement(addToCart).click();
WebElement cartcheck=driver.findElement(addToCart);
System.out.println("Clicked on AddAToCart");
if (cartcheck.isDisplayed()) {
    System.out.println( productName +" Added to cart ");
}		
	}
	
	
}
