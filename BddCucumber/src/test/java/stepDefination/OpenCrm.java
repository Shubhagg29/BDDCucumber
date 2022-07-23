package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import MyHooks.TestHooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCrm {
	WebDriver driver;
	
	
	@Given("User login  the system")
	public void user_login_in_the_system() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("<<-----User Logged  the System----->>");
	}

	@Then("User opend the browser")
	public void user_opend_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("<<-----User Launched  the browser----->>");
	}

	@Then("user enter the open Crm url")
	public void user_enter_the_open_crm_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("<<-----User Entered  in the URl----->>");
	}

	@Given("user open firefox  Browser")
	public void user_open_firefox_browser() {
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
	}

	@Given("user Enter Open Crm URL")
	public void user_enter_open_crm_url() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
	}

	@When("User enter {string}  and {string}")
	public void user_enter_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		//js.executeAsyncScript(script);
				driver.findElement(By.id("Inpatient Ward")).click();
				
				WebElement	ele= driver.findElement(By.id("loginButton")) ;
				
				ele.click();
	}

	@Then("Crm Welcome page displays")
	public void crm_welcome_page_displays() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Button Clicked");
		WebElement logo = driver.findElement(By.xpath("//div[contains(@class,'logo')]"));		
	boolean flag=	logo.isDisplayed();
	Assert.assertTrue(flag);
	driver.close();
	
	}
	@Given("user open chrome  Browser")
	public void user_open_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}

	@Given("user Enter other URL")
	public void user_enter_other_url() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
	}

	@When("Registered user enter {string}  and {string}")
	public void registered_user_enter_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("Enter login button")
	public void enter_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Laboratory")).click();
		Thread.sleep(2000);
		WebElement	ele= driver.findElement(By.id("loginButton")) ;
		
		ele.click();
	}

	@Then("Crm lab page displays")
	public void crm_lab_page_displays() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Button Clicked");
		WebElement logo = driver.findElement(By.xpath("//div[contains(@class,'logo')]"));		
	boolean flag=	logo.isDisplayed();
	Assert.assertTrue(flag);
	driver.close();
	}


}
