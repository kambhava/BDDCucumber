package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Pages.loginPage;
import cucumberHooks.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions  {

	WebDriver driver;
	loginPage lpg =        new loginPage(DriverManager.getDriver());
	 


	 @Given("browser window is open")
	 public void browser_window_is_open() throws Exception {
		 System.out.println("browser_is_open()................................................................");	
			//DriverManager.driver.get("https://www.google.com/");
			driver=DriverManager.getDriver();
			driver.get("https://www.google.com/");
	 }

	 @Given("user is on google search page")
 		 public void user_is_on_google_search_page() {
				System.out.println("Inside Step - user is on goolge search page");
				
	 }

	 @When("user enters a text in search box {string}")
	 public void user_enters_a_text_in_search_box(String srchTxt) throws Exception {
		 System.out.println("Inside Step - user enters a text in search box");

		 
		lpg.searchText(srchTxt);
		 //loginPage.searchText(srchTxt);
				Thread.sleep(2000);
	 }

	 @When("hits enter")
	 public void hits_enter() throws Exception {
		 System.out.println("Inside Step - hits enter");
		 lpg.srchEnter();
		 
 				Thread.sleep(2000);
	 }

	 @Then("user is navigated to search results {string}")
	 public void user_is_navigated_to_search_results(String string) {
		 System.out.println("Inside Step - user is navigated to search results");
		 System.out.println("Completed Successfully");
	 }

}
