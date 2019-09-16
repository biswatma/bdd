package SetDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepdefinition {
	
	
	WebDriver driver;
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\thesu\\eclipse-workspace\\Cucumber_Bdd\\driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://google.com");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
	    // Write code here that turns the phrase above into concrete actions
	
		
				String bodyText = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).getAttribute("value");
				Assert.assertTrue("Google Search", bodyText.contains("Google"));
	  
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	 driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("jpmorgan");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("(//span[text()='jpmorgan'])[1]")).click();
	 
	 
	 
	  
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
